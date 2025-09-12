import java.util.*;


public class tree {
    static class Node{
        int data;
        Node left;
        Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    }

    static class BT{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
              idx++;
              if(nodes[idx] == -1){
                  return null;
              }
              Node newNode = new Node(nodes[idx]);
              newNode.left = buildTree(nodes);
              newNode.right = buildTree(nodes);
              return newNode;
        };
    }

    // pre order T.C = O(N)
    public static void preOrder(Node root){
        if(root == null){
            System.out.println("-1");
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // inorder
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    // post order
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // level order
    public static void levelOrder(Node root){
        if(root == null){
            System.out.println("NULL");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur = q.remove();
            if(cur == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                System.out.println(cur.data + " ");
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
    }

    // count nodes
    public static int count(Node root){
        int c = 0;
        if(root == null){
            return 0;
        }
           int l = count(root.left);
           int r = count(root.right);

            return c = l + r + 1;
    }

    // sum of nodes
    public static int sum(Node root){
        int c = 0;
        if(root == null){
            return 0;
        }
        int l = sum(root.left);
        int r = sum(root.right);

        return c = l + r + root.data;
    }


    // height of the tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return 1 + Math.max(l, r);
    }

    // diameter of a tree T.C = O(N^2)
    public static int dia(Node root){
        if(root == null){
            return 0 ;
        }
        int l = dia(root.left);
        int r = dia(root.right);
        int c = height(root.left) + height(root.right) + 1;
        return Math.max(c,Math.max(l,r));
    }

    // diameter of a tree T.C = O(N)
    static class treeinfo{
        int ht;
        int dia;
        treeinfo(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static treeinfo dia2(Node root){
        if(root == null){
           return  new treeinfo(0,0);
        }
        treeinfo left  = dia2(root.left);
        treeinfo right = dia2(root.right);

        int myh = Math.max(left.ht , right.ht);

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht;

        int mydia = Math.max(Math.max(dia1, dia2), dia3);

        treeinfo res = new treeinfo(myh,mydia);
        return res;
    }

    // subtree of another tree match in leetcode

    public static void main(String[] args) {
     int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BT bt = new BT();
     Node root = bt.buildTree(nodes);// we get the root of the tree
//        System.out.println(root.data);
        System.out.println(dia2(root).dia);
    }
}
