package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue using Java Collection Framework
 *
 * Queue -> Interface
 * LinkedList & ArrayDeque -> Implementations of Queue
 *
 * Both follow FIFO (First In, First Out).
 *
 * LinkedList:
 * - Uses a doubly linked list
 * - Easy to understand
 *
 * ArrayDeque:
 * - Uses a resizable circular array
 * - Faster and more memory efficient
 * - Recommended for queue operations
 */
public class QueueUsingCollectionFramework {

    public static void main(String[] args) {

        // Change only this line to switch the implementation.

        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue Elements:");

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
