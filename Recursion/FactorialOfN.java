package Recursion;

public class FactorialOfN {
    public static int f(int factorial) {
        if (factorial == 0) {
            return 1;
        }
        int fnm1 = factorial * f(factorial - 1);
        return fnm1;
    }

    public static void main(String[] args) {

        int facotrial = 5;
        System.out.println(f(facotrial));
    }
}
