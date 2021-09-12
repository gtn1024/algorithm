package 排序.选择排序;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (var i = 0; i < array.length; i++) {
            var min = i;
            for (var j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                var temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        final var arr = new int[]{6, 3, 8, 5, 2, 7, 4, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
