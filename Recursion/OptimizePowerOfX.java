package Recursion;

public class OptimizePowerOfX {
    public static int printPower(int i, int p) {
        if (p == 0) {
            return 1;
        }
        int powerOfHalf = printPower(i, p / 2);
        if (p % 2 != 0) {
            System.out.println("hey");
            return i * powerOfHalf * powerOfHalf;
        }
        return powerOfHalf * powerOfHalf;
    }

    public static void main(String[] args) {
        System.out.println(printPower(2, 10));
    }
}
