package 链表;

public class MyLinkedList {
    /**
     * 头节点指针
     */
    private Node head;
    /**
     * 尾节点指针
     */
    private Node last;
    /**
     * 链表实际长度
     */
    private int size;

    /**
     * 链表插入元素
     *
     * @param data  插入元素
     * @param index 插入位置
     */
    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        final var insertedNode = new Node(data);
        insertedNode.prev = last;
        if (size == 0) {
            // 空链表
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            // 插入头部
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            // 插入尾部
            last.next = insertedNode;
            last = insertedNode;
        } else {
            // 插入中间
            final var prevNode = get(index - 1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;
        }
        size++;
    }

    /**
     * 修改数据元素
     *
     * @param index   修改元素索引
     * @param newData 修改值
     */
    public void update(int index, int newData) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        final var node = get(index);
        node.data = newData;
    }

    /**
     * 链表删除元素
     *
     * @param index 删除位置
     */
    public Node remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node removedNode = null;
        if (index == 0) {
            // 删除头节点
            removedNode = head;
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            // 删除尾节点
            final var prevNode = get(index - 1);
            removedNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            // 删除中间节点
            final var prevNode = get(index - 1);
            final var nextNode = prevNode.next.next;
            removedNode = prevNode.next;
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        }
        size--;
        return removedNode;
    }

    /**
     * 链表查找元素
     *
     * @param index 查找位置
     */
    public Node get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        var temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 输出链表
     */
    public void output() {
        var temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * 链表节点
     */
    private static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws Exception {
        final var myLinkedList = new MyLinkedList();
        myLinkedList.insert(0, 3);
        myLinkedList.insert(1, 7);
        myLinkedList.insert(2, 9);
        myLinkedList.insert(3, 5);
        myLinkedList.output();
        System.out.println("--------------");
        myLinkedList.update(3, 8);
        myLinkedList.remove(0);
        myLinkedList.output();
    }
}
