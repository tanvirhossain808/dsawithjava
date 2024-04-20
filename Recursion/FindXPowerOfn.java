
class FindXPowerOfn {
    public static int powerOfX(int x, int p) {
        if (p == 0) {
            return 1;
        }
        return x * powerOfX(x, p - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfX(2, 10));
    }
}