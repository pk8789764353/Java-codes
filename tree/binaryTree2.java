
public class binaryTree2 {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // Main tree
        //     5
        //    / \
        //   3   4
        //  / \  / \
        // 6   78   9
        //
        //
        Node m = new Node(5);
        m.left = new Node(3);
        m.right = new Node(4);
        m.left.left = new Node(6);
        m.left.right = new Node(7);
        m.right.left = new Node(8);
        m.right.right = new Node(9);

        //sub tree
        //        4
        //       / \ 
        //      8   9

        Node s=new Node(4);
        s.left=new Node(8);
        s.right=new Node(9);

    }
}
