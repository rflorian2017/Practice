package sample;

class Main2 {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.add(3); // root : val = 4, left, right = null
        System.out.println(tree.root.value);
        System.out.println(tree.root.left);
        tree.add(7);
        System.out.println(tree.root.right);
        System.out.println(tree.root.right.value);

        tree.add(2);
        System.out.println(tree.root.left);
        System.out.println(tree.root.left.value);
    }
}

public class MyTree {

    Node root;

    public void add(int i) {
        Node node = new Node(i);
        // add a first element
        if (root == null) {
            root = node;
        }
        else {
            add(root, node);
        }
    }

    private void add(Node root, Node newNode) {
        if(newNode.value > root.value) {
            root.right = newNode;
        }
        else {
            root.left = newNode;
        }
    }

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
