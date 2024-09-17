public class queue_using_linkedlist {
   static class Node {
        int data;
        Node next;

        // Constructor to initialize a node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListQueue {
        private Node front;
        private Node rear;
        private int size;

        // Constructor to initialize the queue
        public LinkedListQueue() {
            this.front = null;
            this.rear = null;
            this.size = 0;
        }

        // Utility function to add an element to the rear
        public void enqueue(int item) {
            Node newNode = new Node(item);

            // If queue is empty, set both front and rear to the new node
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Inserted " + item);
        }

        // Utility function to remove the front element
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println("Removed " + front.data);
            front = front.next;
            size--;

            // If the queue becomes empty, set rear to null
            if (isEmpty()) {
                rear = null;
            }
        }

        // Utility function to return the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Utility function to return the size of the queue
        public int size() {
            return size;
        }

        // Utility function to check if the queue is empty
        public boolean isEmpty() {
            return (size == 0);
        }
    }

    public static void main(String[] args) {
        LinkedListQueue h = new LinkedListQueue();
        h.enqueue(1);
        h.enqueue(2);
        h.enqueue(3);
        System.out.println(h.peek());
    }
}
