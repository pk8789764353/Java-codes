import java.util.*;
public class  Binaryree{
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
    static class Binarytree {
        //Construct tree using preorder traversal
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        //DFS traversal
        public static void preOrder(Node root)
        {
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root)
        {
            if(root==null) return;           
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void inOrder(Node root)
        {
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        //Level order traversal (BFS)
        public static void levelOrder(Node root)
        {
            if(root==null) return;
            Queue <Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null)
                {
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);                    
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)
                    q.add(curr.left);
                    if(curr.right!=null)
                    q.add(curr.right);
                }
            }
        }
        //Height of a tree
        public static int height(Node root)
        {
            if(root==null)
            return 0;
            int lh=height(root.left);
            int rh=height(root.right);
            return (1+Math.max(lh,rh));
        }
        //Count of nodes of a tree
        public static int count(Node root)
        {
            if(root==null) return 0;
            int lc=count(root.left);
            int rc=count(root.right);
            return 1+lc+rc;
            
        }
        //sum of nodes
        static int count=0;

        public static int sum(Node root)
        {
            if(root==null)
            return 0;
            int ls=sum(root.left);
            int rs=sum(root.right);
            return ls+rs+root.data;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.println("preorder traversal");
        // tree.preOrder(root);
        // System.out.println("\npostorder traversal");
        // tree.postOrder(root);
        // System.out.println("\ninorder traversal");
        // tree.inOrder(root);
        // tree.levelOrder(root);
        // System.out.print(tree.height(root));
        // System.out.print(tree.count(root));
        System.out.print(tree.sum(root));
    }
}
