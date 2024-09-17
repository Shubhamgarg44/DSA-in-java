public class stack {
    // stack using linked list
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stacknew{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
              Node newNode = new Node(data);
              if(isEmpty()){
                  head = newNode;
                  return;
              }
              newNode.next = head;
              head = newNode;
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");

            }
            int data = head.data;
            head = head.next;
            System.out.println(data);

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
      stacknew s = new stacknew();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.pop();
      s.peek();
    }
}
