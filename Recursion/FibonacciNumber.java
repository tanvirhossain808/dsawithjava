package Recursion;

public class FibonacciNumber {
    public static int printFibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return printFibonacci(n - 2) + printFibonacci(n - 1);

    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(printFibonacci(number));

    }
}
