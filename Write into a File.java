
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteString {

    public static void main(String[] args)
            throws IOException {
        String text = "Welcome";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Path : ");
        String path = br.readLine();
        Path fileName = Path.of(path);

        try {
            Files.writeString(fileName, text);
            String fileContent = Files.readString(fileName);
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
