package 排序.冒泡排序;

import java.util.Arrays;

public class 冒泡排序 {
    /**
     * 冒泡排序
     *
     * @param arr 待排序的数组
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                var temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        var arr = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
