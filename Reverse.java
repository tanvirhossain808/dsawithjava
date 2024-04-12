public class Reverse {
    public static void reverseArray(int numbers[]) {
        for (int i = 0; i <= numbers.length / 2 - 1; i++) {
            int temp = 0;
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverseArray(numbers);
    }
}
