package Bitmanipulation;

public class ClearIthBith {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        System.out.println(bitMask);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(
                clearIthBit(10, 2));
    }
}
