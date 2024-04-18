public class NumberPiramid {
    public static void numberPrint(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // public static void printHalfInvertedPiramid() {
    // for (int i = 0; i <= 4; i++) {
    // for (int j = 0; j <= 4 - i - 1; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 0; k <= i; k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }

    // public static void printnumberPiramid() {
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 0; j <= 5 - i; j++) {
    // System.out.print(j + 1);
    // }
    // System.out.println();
    // }
    // }
    // public static void printnumberPiramid() {
    // int number = 1;
    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1");
    // } else {
    // System.out.print("0");
    // }
    // // System.out.println();
    // // System.out.println();
    // }

    // // for (int k = 0; k < 5 - i - 1; k++) {

    // // }
    // System.out.println();

    // }
    // }
    public static void butterFly() {

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 5 - i - 1; k++) {
                System.out.print(" ");
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 5 - i - 1; k++) {
                System.out.print(" ");
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // numberPrint(5);
        // printHalfInvertedPiramid();
        // printnumberPiramid();
        butterFly();
    }
}
