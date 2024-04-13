import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {

        Integer sortArray[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(sortArray, 0, 3, Collections.reverseOrder());
        // Arrays.sort(sortArray, 0, 3);
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i]);
        }
    }
}
