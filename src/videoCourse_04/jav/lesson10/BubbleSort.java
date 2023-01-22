package videoCourse_04.jav.lesson10;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 2, 6};
        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int out = array.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
    }
}