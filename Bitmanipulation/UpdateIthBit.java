package Bitmanipulation;

public class UpdateIthBit {
    public static int setIthBith(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updatateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBith(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        // System.out.println(bitMask);
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updatateBit(10, 2, 1));

    }

}
