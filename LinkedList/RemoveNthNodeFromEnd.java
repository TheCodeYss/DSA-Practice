package LinkedList;

/**
 * Remove the nth node from the end
 * of a singly linked list.
 */
public class RemoveNthNodeFromEnd {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at end
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Remove nth node from end
    public Node removeNthFromEnd(Node head, int n) {

        // Empty list
        if (head == null) {
            return null;
        }

        // If list has only one node
        if (head.next == null) {
            return null;
        }

        int size = 0;
        Node temp = head;

        // Step 1: Find size of linked list
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // If nth node from end is the first node itself
        // Example:
        // 1 -> 2 -> 3 , n = 3
        // remove head
        if (n == size) {
            return head.next;
        }

        // Step 2:
        // Find previous node of target node
        // size - n gives previous node position
        int positionToFind = size - n;
        Node prev = head;
        int currentPosition = 1;

        while (currentPosition != positionToFind) {
            prev = prev.next;
            currentPosition++;
        }

        // Step 3:
        // Skip target node
        prev.next = prev.next.next;

        return head;
    }

    // Print linked list
    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd list = new RemoveNthNodeFromEnd();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");

        System.out.println("Original List:");
        list.printList();

        int n = 2;
        list.head = list.removeNthFromEnd(list.head, n);

        System.out.println("After removing " + n + "th node from end:");
        list.printList();
    }
}
