import java.util.ArrayList;

public class binary_search_tree {
    public static void main(String[] args) {
      int values[] = {5,1,3,4,2,7};
      Node root = null;
       for (int i = 0; i < values.length; i++) {
             root = insert(root, values[i]);
       }
        inorder(root);
        System.out.println();
//        System.out.println(search(root, 6));
//        delete(root, 5);
//
//        inorder(root);
//        System.out.println();

//        pir(root, 6,9);
        ArrayList<Integer> path = new ArrayList<>();
        prtl(root,path);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static void inorder (Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // making tree
    static Node insert(Node root, int data) {
          if (root == null) {
              root = new Node(data);
              return root;
          }
          if(root.data > data){
              root.left = insert(root.left, data);
          }
          else if(root.data < data){
              root.right = insert(root.right, data);
          }
          return root;
    }

    // search in bst
    static boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data > data) {
            return search(root.left, data);
        }
        if (root.data < data) {
            return search(root.right, data);
        }
        return false;
    }

    // delete node
    static Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }
         if (root.data > data) {
             root.left = delete(root.left, data);
         }
         else if (root.data < data) {
             root.right = delete(root.right, data);
         }
         else{ // root.data == data
             //case 1 (no chile )
             if (root.left == null && root.right == null) {
                 return null;
             }
             // case 2 (one child)
              if (root.left == null) {
                  return root.right;
              }
              else if (root.right == null) {
                  return root.left;
              }

              // case 3 (two children)
             Node is = inorderS(root.right);
              root.data = is.data;
              root.right = delete(root.right, is.data);
         }
         return root;
    }

    // for delete case 3
    static Node inorderS(Node root){
           while(root.left != null){
               root = root.left;
           }
           return root;
    }

    // print in range
    static void pir(Node root, int x, int y){
         if(root == null){
             return;
         }

        if(root.data >= x && root.data <= y){
             pir(root.left, x, y);
            System.out.println(root.data+"");
             pir(root.right, x, y);
        }

        // case 2 x> root
       else if(root.data < x){
            pir(root.right, x, y);
        }

        // case 3 y < root
       else if(root.data > y){
            pir(root.left, x, y);
        }
    }

    // print root to leaf
    static void prtl(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpath(path);
            prtl(root.left, path);
            prtl(root.right, path);
        } else {
            prtl(root.left, path);
            prtl(root.right, path);
        }
            path.remove(path.size() - 1);
        }

        static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
        }
}
