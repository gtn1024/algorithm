package 链表;

public class ALinkedList {
    private Node head;
    private Node last;
    private int size;



    public static class Node {
        int score;
        Node prev;
        Node next;

        public Node(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {

    }
}
