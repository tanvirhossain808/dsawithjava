package Recursion;

public class FofNaturlamNumberSum {
    public static int calSum(int naturalNum) {
        if (naturalNum == 1) {
            return 1;
        }

        return naturalNum + calSum(naturalNum - 1);

    }

    public static void main(String[] args) {
        int naturalNum = 5;
        System.out.println(calSum(naturalNum));

    }
}
