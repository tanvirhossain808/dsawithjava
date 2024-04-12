public class BinarySearc {
    public static int searcKeyIndex(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            // System.out.println(start);
            int mid = (start + end) / 2;
            System.out.print(end);
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        int key = 4;
        // System.out.println(searcKeyIndex(numbers, key));
        searcKeyIndex(numbers, key);
    }
}
