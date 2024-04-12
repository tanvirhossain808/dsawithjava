public class ps {

    public static void prefixSum(int number[]) {
        int cv = 0;
        int mv = Integer.MIN_VALUE;

        int prifix[] = new int[number.length];
        prifix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prifix[i] = prifix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                cv = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
                if (cv > mv)
                    mv = cv;
            }

        }
        System.out.println(mv);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        prefixSum(number);
    }

}
