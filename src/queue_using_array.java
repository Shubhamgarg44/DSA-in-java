public class queue_using_array {
  public static class Queue {
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int count;

        // Constructor to initialize the queue
          Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;
        }

        // Utility function to remove the front element
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println("Removing " + arr[front]);
            front = (front + 1) % capacity;
            count--;
        }

        // Utility function to add an element to the rear
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
            System.out.println("Inserting " + item);
        }

        // Utility function to return the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // Utility function to return the size of the queue
        public int size() {
            return count;
        }

        // Utility function to check if the queue is empty
        public boolean isEmpty() {
            return (size() == 0);
        }

        // Utility function to check if the queue is full
        public boolean isFull() {
            return (size() == capacity);
        }
    }
    public static void main(String[] args) {
      Queue q = new Queue(5);
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);

        System.out.println(q.peek());
    }
}
