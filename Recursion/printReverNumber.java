package Recursion;

public class printReverNumber {
    public static void printReverNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printReverNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printReverNumbers(n);
    }

}
