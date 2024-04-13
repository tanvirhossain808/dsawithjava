public class SelectionSort {
    public static void sortArray(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {

        int numbers[] = {
                5, 4, 1, 3, 2
        };

        sortArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

}
