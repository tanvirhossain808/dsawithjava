package Recursion;

public class FindLastOccurance {
    public static int printLastOccurante(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = printLastOccurante(arr, target, i + 1);
        if (isFound == -1 && arr[i] == target) {
            return i;
        }
        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 3, 3, 5, 9, 9 };
        System.out.println(printLastOccurante(arr, 2, 0));
    }
}
