package sample;

public class MyLinkedList {

    Node head;

    public <T> void add(T i) {
        Node node = new Node(i);
        node.next = null;

        if(head == null) {
            head = node;
        }

        else {
            Node last = head;
            while (last.next!=null) {
                last = last.next;
            }
            last.next = node;

        }
    }

    class Node <T> {
        T value;

        Node next;

        public Node(T value) {
            this.value = value;
            next = null;
        }
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

    }
}
