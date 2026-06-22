package LinkedList;

/**
 * Check whether a singly linked list is palindrome or not.
 */
public class PalindromeLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at end
    public void addLast(int data) {
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

    // Find middle node of linked list
    public Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // slow moves 1 step, fast moves 2 steps
        // when fast reaches end, slow reaches middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reverse linked list
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Check if linked list is palindrome
    public boolean isPalindrome(Node head) {

        // Empty list or single node is always palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle of linked list
        Node firstHalfEnd = getMiddle(head);

        // Step 2: Reverse second half
        Node secondHalfStart = reverse(firstHalfEnd.next);

        // Step 3: Compare first half and reversed second half
        Node firstHalfStart = head;

        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }

            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
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
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        System.out.println("Linked List:");
        list.printList();

        boolean ans = list.isPalindrome(list.head);
        System.out.println("Is Palindrome? " + ans);
    }
}
