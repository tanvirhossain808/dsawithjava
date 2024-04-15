
public class CheckNumberIsEvenOdd {
    public static void checkIsEvenOrOd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }

    }

    public static void main(String[] args) {

        checkIsEvenOrOd(4);
    }

}