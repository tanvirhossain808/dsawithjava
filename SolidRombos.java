public class SolidRombos {

    public static void printSolidRombos(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                // System.out.print("*");
                if (k == 1 || k == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        printSolidRombos(5);
    }
}
