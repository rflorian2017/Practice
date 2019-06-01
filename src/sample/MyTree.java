package sample;

public class MyTree {

    Node head;



    class Node {
        int value;

        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }


}
