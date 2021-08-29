package 队列;

public class MyArrayQueue {
    private int[] array;
    private int front;
    private int rear;

    public MyArrayQueue(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * 入队
     *
     * @param element 入队的元素
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) throw new Exception("队列已满");
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /**
     * 出队
     */
    public void deQueue() throws Exception {
        if (rear == front) throw new Exception("队列已空");
        front = (front + 1) % array.length;
    }

    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        final var queue = new MyArrayQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.output();
    }
}
