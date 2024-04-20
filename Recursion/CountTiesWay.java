package Recursion;

public class CountTiesWay {
    public static int countTotalTilsWay(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = countTotalTilsWay(n - 1);
        int fnm2 = countTotalTilsWay(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(countTotalTilsWay(4));
    }
}
