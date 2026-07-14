package Queue;

/**
 * Queue Implementation using Linked List.
 *
 * Queue follows the FIFO (First In First Out) principle.
 *
 * Enqueue : Insert element at the rear.
 * Dequeue : Remove element from the front.
 * Peek    : View the front element.
 *
 * Time Complexity:
 * Enqueue : O(1)
 * Dequeue : O(1)
 * Peek    : O(1)
 */
public class QueueUsingLinkedList {

    static class Queue {

        // Node of the linked list
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private Node tail;

        // Check if queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add element at the rear
        public void add(int data) {

            Node newNode = new Node(data);

            // First insertion
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Remove front element
        public int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int frontElement = head.data;

            // If only one element exists
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }

            return frontElement;
        }

        // Return front element
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue();

        // Insert elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        System.out.println("Remaining Queue:");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
