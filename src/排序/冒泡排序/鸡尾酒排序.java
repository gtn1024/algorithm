package 排序.冒泡排序;

import java.util.Arrays;

public class 鸡尾酒排序 {
    public static void sort(int[] array) {
        var temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            var isSorted = true;
            // 奇数轮，从左向右比较和交换
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
            // 偶数轮之前，将isSorted标记为true
            isSorted = true;
            for (int j = array.length - i - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    public static void main(String[] args) {
        var arr = new int[]{2, 3, 4, 5, 6, 7, 8, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
