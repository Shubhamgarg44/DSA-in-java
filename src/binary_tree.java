import java.util.LinkedList;
import java.util.Queue;

public class binary_tree {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static class BT{
        static int idx = -1;
         public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
         }
     }

     public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
         System.out.println(root.data + "");
         preOrder(root.left);
         preOrder(root.right);
     }

     public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + "");
        inOrder(root.right);
     }

     public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + "");

     }

     public static void levelOrder(Node root) {
        if(root == null) {
      return;
        }
         Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
        while(!q.isEmpty()) {
            Node currnode = q.remove();
            if (currnode == null) {
                System.out.println(); // print next line

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data + "");
                if(currnode.left != null) {
                    q.add(currnode.left);
                }

                if (currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
     }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
        levelOrder(root);

    }
}
