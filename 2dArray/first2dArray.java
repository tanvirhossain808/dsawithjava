import java.util.Scanner;

public class first2dArray {
    public static int searcKey(int arr[][], int key) {
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                lowest = Math.min(lowest, arr[i][j]);
                highest = Math.max(arr[i][j], highest);
            }

        }
        System.out.println(highest);
        return lowest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        // for (int i = arr.length - 1; i >= 0; i--) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j]);
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        int s = searcKey(arr, 50);
        // System.out.print(s);
        // System.out.println(arr[0]);
        System.out.println(s);
    }
}