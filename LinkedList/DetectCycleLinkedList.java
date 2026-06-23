package LinkedList;

/**
 * Detect Cycle in a Singly Linked List
 * using Floyd's Cycle Detection Algorithm
 * (Tortoise and Hare Algorithm).
 */
public class DetectCycleLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect cycle in linked list
    public boolean hasCycle(Node head) {

        Node hare = head;
        Node turtle = head;

        // hare moves 2 steps
        // turtle moves 1 step
        while (hare != null && hare.next != null) {

            hare = hare.next.next;
            turtle = turtle.next;

            // If both pointers meet,
            // cycle exists
            if (hare == turtle) {
                return true;
            }
        }

        // hare reached null
        // no cycle exists
        return false;
    }

    public static void main(String[] args) {

        DetectCycleLinkedList list = new DetectCycleLinkedList();

        Node first = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle:
        // 4 -> 2
        fourth.next = second;

        System.out.println(list.hasCycle(first));
    }
}
