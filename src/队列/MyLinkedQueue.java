package 队列;

public class MyLinkedQueue {
    private Node head;
    private Node last;
    private int size;

    /**
     * 入栈
     *
     * @param data 数据
     */
    public void enQueue(int data) {
        final var newNode = new Node(data);
        if (size == 0) {
            // 空队列
            head = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    /**
     * 出栈
     */
    public void deQueue() {
        final var nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
        size--;
    }

    /**
     * 输出
     */
    public void output() {
        var temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static class Node {
        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        final var queue = new MyLinkedQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.output();
    }
}
