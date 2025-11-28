
class finding {

    private static boolean isElementPresent(int[] arr, int key) {
        for (int element : arr) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 6, 10};
        int key = 7;

        boolean res = isElementPresent(arr, key);
        System.out.println("Is " + key + " present in the array: " + res);
    }
}
