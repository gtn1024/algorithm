package 排序.冒泡排序;

import java.util.Arrays;

public class 冒泡排序 {
    /**
     * 冒泡排序
     *
     * @param array 待排序的数组
     */
    public static void bubbleSort(int[] array) {
        for (var i = 0; i < array.length - 1; i++) {
            for (var j = 0; j < array.length - i - 1; j++) {
                var temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        var arr = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
