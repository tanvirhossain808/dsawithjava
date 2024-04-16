package Bitmanipulation;

public class ClearLastIbits {
    public static int clearIthBit(int n, int i) {
        int Bitmask = (~0) << i;
        return n & Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 2));
    }

}
