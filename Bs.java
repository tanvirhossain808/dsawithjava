public class Bs {

    public static int[] sortArray(int numbers[]) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }
        }
        return numbers;

    }

    public static void main(String[] args) {

        int numbers[] = { 5, 4, 1, 3, 2 };

        int arr[] = sortArray(numbers);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}
