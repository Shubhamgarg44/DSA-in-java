public class circular_queue {
   static class CircularQueue {
        private int[] arr;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        // Constructor to initialize the queue
        public CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }

        // Utility function to add an element to the rear
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // Calculate the new rear position in a circular manner
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            size++;

            // If the queue was empty, set front to 0
            if (front == -1) {
                front = 0;
            }

            System.out.println("Inserted " + item);
        }

        // Utility function to remove the front element
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println("Removed " + arr[front]);
            front = (front + 1) % capacity;
            size--;

            // If the queue is now empty, reset front and rear to initial state
            if (size == 0) {
                front = -1;
                rear = -1;
            }
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
            return size;
        }

        // Utility function to check if the queue is empty
        public boolean isEmpty() {
            return (size == 0);
        }

        // Utility function to check if the queue is full
        public boolean isFull() {
            return (size == capacity);
        }
    }
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        System.out.println(c.peek());
    }
}
