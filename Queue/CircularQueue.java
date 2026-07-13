package Queue;

/**
 * Circular Queue Implementation using Array.
 *
 * Queue follows the FIFO (First In First Out) principle.
 *
 * Enqueue : Insert element at the rear.
 * Dequeue : Remove element from the front.
 * Peek    : View the front element.
 *
 * Unlike a linear queue, a circular queue reuses
 * empty spaces created after deletions.
 *
 * Time Complexity:
 * Enqueue : O(1)
 * Dequeue : O(1)
 * Peek    : O(1)
 */
public class CircularQueue {

    static class Queue {

        private int[] arr;
        private int size;
        private int front;
        private int rear;

        // Create a circular queue
        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // Check if queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add element at the rear
        public void add(int data) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            // Insert first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove front element
        public int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int frontElement = arr[front];

            // If only one element exists
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return frontElement;
        }

        // Return front element
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        // Insert elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Remove two elements
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Reuse freed spaces
        queue.add(60);
        queue.add(70);

        System.out.println("Queue Elements:");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
