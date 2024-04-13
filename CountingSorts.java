public class CountingSorts {
    public static void coutigSort(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // for (int i = 0; i < count.length; i++) {
        // System.out.print(count[i]);
        // }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // System.out.println(count[3]);
    }

    public static void main(String[] args) {

        int numbers[] = { 5, 4, 3, 2, 2, 1 };
        // System.out.println(numbers[2]++);
        coutigSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }
}
