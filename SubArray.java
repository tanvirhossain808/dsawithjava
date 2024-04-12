public class SubArray {
    public static void printSubArray(int numbers[]) {
        int temp = 0;
        int largest = 0;
        int smallest = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    temp += numbers[k];
                }
                if (smallest == 0)
                    smallest = temp;
                if (temp > largest)
                    largest = temp;
                if (temp < smallest)
                    smallest = temp;
                temp = 0;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("largest is:" + largest + " smallest:" + smallest);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubArray(numbers);

    }

}
