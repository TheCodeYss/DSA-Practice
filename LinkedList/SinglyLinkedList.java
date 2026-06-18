package LinkedList;

/**
 * Singly Linked List Implementation
 *
 * Operations:
 * 1. Add First
 * 2. Add Last
 * 3. Delete First
 * 4. Delete Last
 * 5. Print List
 * 6. Track Size
 */

public class SinglyLinkedList {

    Node head;
    private int size;

    // Linked List constructor
    SinglyLinkedList() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

            // Whenever a node is created
            // size increases automatically
            size++;
        }
    }

    // Add First
    //
    // Flow:
    // Create Node
    // ↓
    // Point new node to current head
    // ↓
    // Move head to new node
    public void addFirst(String data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    //
    // Flow:
    // Start from head
    // ↓
    // Move till last node
    // ↓
    // Attach new node
    public void addLast(String data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        // Traverse till next becomes null
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Delete First
    //
    // Flow:
    // Move head to second node
    // ↓
    // First node automatically removed
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        size--;

        // Skip first node
        head = head.next;
    }

    // Delete Last
    //
    // Need second last node to delete last node
    //
    // 10 -> 20 -> 30 -> null
    //       ↑      ↑
    //      SL      L
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // Decrease size before single-node return
        // otherwise size won't update correctly
        size--;

        // Single node case
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        // Move both pointers together
        while (last.next != null) {

            secondLast = secondLast.next;
            last = last.next;
        }

        // Disconnect last node
        secondLast.next = null;
    }

    // Print List
    //
    // Flow:
    // Start from head
    // ↓
    // Print current node
    // ↓
    // Move to next node
    // ↓
    // Repeat until null
    public void printList() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {

            System.out.print(currNode.data + " --> ");

            // Most important Linked List statement
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst("10");
        list.addFirst("20");
        list.addFirst("30");

        list.addLast("40");

        list.printList();

        System.out.println("Size = " + list.getSize());

        list.deleteFirst();
        list.deleteLast();

        list.printList();

        System.out.println("Size = " + list.getSize());
    }
}
