public class linked_list {
    Node head;
    private int size;

    linked_list(){
        this.size = 0;
    }

    class Node {

         String data;
         Node next;

         Node(String data) {
             this.data = data;
             this.next = null;
             size++;
         }
    }

    // add at first and last
    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // add at last

    public void addlast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node currnode  = head;
        while (currnode.next != null){
            currnode = currnode.next;
        }

        currnode.next = newnode;

    }

    // delete at first
public void deletefirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
}

// delete at last
    public void deletelast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
      size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode  = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // print
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currnode  = head;
        while (currnode != null){
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    // print size
    public int size(){
        return size;
    }


    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.addfirst("a");
        list.addlast("b");
        // list.printlist();
        list.addlast("f");
        System.out.println(list.size());
        list.printlist();
        list.deletefirst();
        list.deletelast();
        list.printlist();
        System.out.println(list.size());
    }
}
