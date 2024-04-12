import java.util.*;

public class JavaBasic {

    public static void main(String args[]) {
        /*
         * System.out.println("Hello word");
         * System.out.print("Hello word\n");
         * System.out.print("Hello word");
         */

        // taking the input

        Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // String string = sc.nextLine();
        // System.err.println(string);

        // add two number
        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * System.out.println(sum);
         */

        // float circle = sc.nextFloat();
        // float radius = 3.14f * circle * circle;
        // System.out.println(radius);

        /*
         * int number = (1 * 11) + 0;
         * System.out.println(number);
         * 
         * int n = 10899;
         * int rev = 0;
         * while (n > 0) {
         * int lastDigit = n % 10;
         * rev = (rev * 10) + lastDigit;
         * n = n / 10;
         * }
         * System.out.println(rev);
         */

        int number = 4;
        char ch = 'J';
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                // System.out.print(j);
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }

    }

}