package JavaInterview;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));

    }


}
