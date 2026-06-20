package LinkedList;

/**
 * This program reverses a singly linked list
 * using recursion.
 */

public class ReverseLLRecursive {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse linked list recursively
    public Node reverseLL(Node head) {

        // Base condition:
        // empty list, single node, or last node reached
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the remaining linked list first
        Node newHead = reverseLL(head.next);

        // During backtracking:
        // reverse current link
        head.next.next = head;

        // Break old forward link
        head.next = null;

        // newHead always points to the first node
        // of the fully reversed linked list
        return newHead;
    }

    public static void main(String[] args) {

        // Main focus of this file is recursive reverse logic
    }
}
