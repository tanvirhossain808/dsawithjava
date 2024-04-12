
public class btd {

    public static int binaryToDecimal(int binary) {
        int getBinary = binary;
        int pow = 0;
        int decimal = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            binary = binary / 10;
            pow++;
        }
        System.out.println("Deciaml Degit of " + getBinary + ":" + decimal);
        return decimal;
    }

    public static void decimalToBinary(int decimal) {
        int resultBinary = decimal;

        int pow = 0;
        int binary = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            System.out.println(rem);
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;

        }
        // System.out.println(binary);

    }

    public static void main(String args[]) {

        // System.out.println(binaryToDecimal(101));
        // binaryToDecimal(1010);
        decimalToBinary(10);
        // System.out.println(binaryToDecimal(1010));

    }

}
