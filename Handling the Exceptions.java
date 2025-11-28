
class Exception {

    public static void main(String[] args) {
        int chocolates[] = {106, 145, 123, 127, 125};
        int students[] = {35, 40, 0, 34, 60};
        int numChoc[] = new int[5];
        try {
            for (int i = 0; i < 5; i++) {
                numChoc[i] = chocolates[i] / students[i];
            }
        } catch (ArithmeticException error) {
            System.out.println("Arithmetic Exception");
            System.out.println(error.getMessage() + " error.");
        }
    }
}
