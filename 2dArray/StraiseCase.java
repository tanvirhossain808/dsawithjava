public class StraiseCase {
    public static boolean staircaseSearch(int arr[][], int key) {
        // int row = 0, col = arr[0].length - 1;
        /*
         * while (row < arr.length && col >= 0) {
         * if (arr[row][col] == key) {
         * return true;
         * } else if (arr[row][col] > key) {
         * col--;
         * } else {
         * row++;
         * }
         * }
         */
        int row = arr.length - 1, col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] == key) {
                return true;
            } else if (arr[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        // System.out.println(row);
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int numbers[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 51;
        boolean ans = staircaseSearch(numbers, key);
        System.out.println(ans);
    }
}
