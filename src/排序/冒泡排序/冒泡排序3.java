package 排序.冒泡排序;

import java.util.Arrays;

public class 冒泡排序3 {
    public static void sort(int[] arr) {
        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        var sortBorder = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            // 有序标记，每一轮初始值都是true
            var isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                var temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 因为有元素进行交换，所以不是有序的
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) break;
        }
    }

    public static void main(String[] args) {
        // 前面4个无序，后面4个有序
        var arr = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
