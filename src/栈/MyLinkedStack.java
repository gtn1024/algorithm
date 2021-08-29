package 栈;

public class MyLinkedStack {
    private Node head;
    private Node last;
    private int size;

    public void push(int data) {
        final var newNode = new Node(data);
        if (size == 0) {
            // 空链表
            head = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void pop() {
        final var prevNode = last.prev;
        prevNode.next = null;
        last = prevNode;
        size--;
    }

    public void output() {
        var temp = this.head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        final var stack = new MyLinkedStack();
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
