package 二分查找;

public class 二分查找 {
    /**
     * 二分查找
     *
     * @param list 数组
     * @param item 欲查找的元素
     */
    public static int binarySearch(int[] list, int item) {
        if (list == null || list.length == 0) return 0;
        var low = 0;
        var high = list.length - 1;
        while (low <= high) {
            final var mid = (low + high) / 2;
            final var guess = list[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final var mylist = new int[]{1, 3, 5, 7, 9};
        System.out.println(binarySearch(mylist, 3));
        System.out.println(binarySearch(mylist, -1));
    }
}
