package Queue;

/**
 * Queue Implementation using Array (Linear Queue).
 *
 * Queue follows the FIFO (First In First Out) principle.
 *
 * Enqueue : Insert element at the rear.
 * Dequeue : Remove element from the front.
 * Peek    : View the front element.
 *
 * Time Complexity:
 * Enqueue : O(1)
 * Dequeue : O(n)  (Elements are shifted)
 * Peek    : O(1)
 */
public class QueueUsingArray {

    static class Queue {

        private int[] arr;
        private int size;
        private int rear;

        // Create a queue of given size
        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add element to the queue
        public void add(int data) {

            // Queue is full
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Remove front element
        public int remove() {

            // Queue is empty
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            // Shift all elements one position to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

            return front;
        }

        // Return front element
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue Elements:");

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
