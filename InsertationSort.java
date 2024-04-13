public class InsertationSort {
    public static void insertationSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > curr) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = curr;
        }

    }

    public static void main(String[] args) {

        int numbers[] = { 5, 4, 1, 3, 2 };

        insertationSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
