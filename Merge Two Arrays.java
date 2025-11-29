
import java.util.Arrays;

public class merge {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70, 80};
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(arr1, 0, c, 0, a1);
        System.arraycopy(arr2, 0, c, a1, b1);
        System.out.println("" + Arrays.toString(c));
    }
}
