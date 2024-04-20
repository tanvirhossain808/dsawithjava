package Recursion;

public class FindFirstOccurance {
    public static int printFirstOccurance(int arr[], int i, int target) {
        if (arr.length == i) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }

        return printFirstOccurance(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 7, 4, 6, 8 };
        int target = 8;
        System.out.println(printFirstOccurance(arr, 0, target));
    }
}
