import java.util.Stack;

/*
 * Queue using Two Stacks (Costly Enqueue)
 *
 * Idea:
 * A Queue follows FIFO (First In, First Out),
 * while a Stack follows LIFO (Last In, First Out).
 *
 * To maintain FIFO order:
 * 1. Move all elements from s1 to s2.
 * 2. Insert the new element into s1.
 * 3. Move all elements back from s2 to s1.
 *
 * This keeps the front element always on the top of s1.
 *
 * Time Complexity:
 * add()      -> O(n)
 * remove()   -> O(1)
 * peek()     -> O(1)
 * isEmpty()  -> O(1)
 *
 * Note:
 * The method names (add, remove, peek) are the same as
 * Java's Collection Framework, but there is NO conflict.
 * Java decides which method to call based on the object.
 *
 * Example:
 * Queue q = new Queue();          // Calls our methods
 * Queue<Integer> q = new LinkedList<>(); // Calls Java methods
 */

public class QueueUsingTwoStacks {

    static class Queue {

        // Each Queue object has its own two stacks.
        // Do NOT make these static.
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        // Returns true if the queue has no elements.
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Enqueue Operation (Costly)
        // Move all elements -> Insert new element -> Restore elements.
        public void add(int data) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue Operation
        // Front element is already on top of s1.
        public int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        // Returns the front element without removing it.
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Front Element: " + q.peek());

        System.out.println("\nQueue Elements:");

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
