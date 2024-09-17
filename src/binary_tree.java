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

     public static int countofNodes(Node root) {
        if(root == null) {
            return 0;
        }
       int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);
        return leftNodes + rightNodes + 1 ;
     }

    public static int sumofNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);
        return leftsum + rightsum + root.data ;
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int total = height(root.left) + height(root.right) + 1;
        return Math.max(total, Math.max(leftDiameter,
                rightDiameter));
    }

    static class treeinfo{
        int h;
        int dia;

        treeinfo(int h, int dia) {
            this.h = h;
            this.dia = dia;
        }
    }

    public static  treeinfo dia2(Node root){
        if(root == null) {
            return new treeinfo(0,0);
        }
        treeinfo left = dia2(root.left);
        treeinfo right = dia2(root.right);

        int myH = Math.max(left.h, right.h) +1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.h + right.h +1 ;

        int mydia = Math.max(Math.max(dia1, dia2), dia3);
        treeinfo res = new treeinfo(myH,mydia);
        return res;
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        levelOrder(root);
//        System.out.println( height(root));
        System.out.println( dia2(root).dia);
    }
}
