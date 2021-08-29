package 栈;

import java.util.Arrays;

public class MyArrayStack {
    private int[] arr;
    private int size;

    public MyArrayStack(int length) {
        arr = new int[length];
    }

    /**
     * 入栈
     *
     * @param data 数据
     */
    public void push(int data) {
        if (size >= arr.length) arr = Arrays.copyOf(arr, 2 * arr.length);
        arr[size] = data;
        size++;
    }

    /**
     * 出栈
     */
    public void pop() {
        arr[size - 1] = 0;
        size--;
    }

    public void output() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        final var stack = new MyArrayStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.output();
        stack.pop();
        stack.output();
    }
}
