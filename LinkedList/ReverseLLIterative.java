package LinkedList;

/**
 * This program reverses a singly linked list
 * using an iterative approach.
 */

public class ReverseLinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse Linked List
    public void reverseLL() {

        // Empty list or single node list
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {

            // Save next node
            Node nextNode = currNode.next;

            // Reverse current link
            currNode.next = prevNode;

            // Move pointers forward
            prevNode = currNode;
            currNode = nextNode;
        }

        // Old head becomes last node
        head.next = null;

        // Update head to new first node
        head = prevNode;
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();

        // Example:
        // 10 -> 20 -> 30 -> null
        //
        // After reverse:
        // 30 -> 20 -> 10 -> null
    }
}
