package LinkedList;

/**
 * Detect and Remove Cycle in a Singly Linked List
 * using Floyd's Cycle Detection Algorithm
 * (Tortoise and Hare Algorithm).
 */
public class RemoveCycleLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect whether cycle exists or not
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

    // Remove cycle from linked list
    public void removeCycle(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        Node hare = head;
        Node turtle = head;
        boolean cycleExists = false;

        // Step 1: Detect cycle
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                cycleExists = true;
                break;
            }
        }

        // No cycle found
        if (!cycleExists) {
            return;
        }

        // Step 2: Move turtle to head
        turtle = head;

        // Special case:
        // cycle starts from head
        if (hare == head) {
            while (hare.next != head) {
                hare = hare.next;
            }
            hare.next = null;
            return;
        }

        // Step 3:
        // move both one step at a time
        // keep track of previous of hare
        Node prev = null;

        while (turtle != hare) {
            prev = hare;
            turtle = turtle.next;
            hare = hare.next;
        }

        // hare/turtle is now at starting node of cycle
        // prev is last node of cycle
        prev.next = null;
    }

    // Print linked list
    public void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        RemoveCycleLinkedList list = new RemoveCycleLinkedList();

        Node first = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);
        Node fifth = list.new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create cycle:
        // 5 -> 3
        fifth.next = third;

        System.out.println("Cycle present before removal: " + list.hasCycle(first));

        list.removeCycle(first);

        System.out.println("Cycle present after removal: " + list.hasCycle(first));

        System.out.println("Linked List after removing cycle:");
        list.printList(first);
    }
}
