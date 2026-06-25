package Stack;

/**
 * Stack using Linked List
 *
 * Core Idea:
 * top of stack = head of linked list
 *
 * push -> add at head
 * pop  -> remove from head
 * peek -> read head data
 *
 * All operations work in O(1) time.
 */
public class StackUsingLinkedList {

    // Node of linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        private Node head; // head = top of stack

        // Check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // =========================================================
        // Push operation
        //
        // newNode.next = head;
        // head = newNode;
        //
        // new node becomes the new top of stack
        // =========================================================
        public void push(int data) {
            Node newNode = new Node(data);

            // if stack is empty, new node becomes head
            if (head == null) {
                head = newNode;
                return;
            }

            // point new node to current top
            newNode.next = head;

            // move head to new node
            head = newNode;
        }

        // =========================================================
        // Pop operation
        //
        // store current top
        // move head to next node
        // return old top value
        // =========================================================
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            Node top = head;   // current top
            head = head.next;  // remove top by moving head forward

            return top.data;
        }

        // =========================================================
        // Peek operation
        //
        // just return top element
        // do not remove it
        // =========================================================
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }

        // Print stack from top to bottom
        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements into stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack after push operations:");
        stack.printStack();

        System.out.println("Top element using peek: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after one pop:");
        stack.printStack();

        System.out.println("Printing all elements from top to bottom:");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
