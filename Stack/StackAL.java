package Stack;

import java.util.ArrayList;

/**
 * Stack Implementation using ArrayList
 *
 * Stack follows the LIFO (Last In, First Out) principle.
 *
 * Operations:
 * 1. push()    -> Add element to the top
 * 2. pop()     -> Remove and return the top element
 * 3. peek()    -> Return the top element without removing it
 * 4. isEmpty() -> Check whether the stack is empty
 *
 * Time Complexity:
 * Push    : O(1)
 * Pop     : O(1)
 * Peek    : O(1)
 * isEmpty : O(1)
 */
public class StackAL {

    static class Stack {

        // ArrayList stores stack elements
        private ArrayList<Integer> list = new ArrayList<>();

        /**
         * Push an element onto the stack.
         */
        public void push(int data) {
            list.add(data);
        }

        /**
         * Check whether the stack is empty.
         */
        public boolean isEmpty() {
            return list.isEmpty();
        }

        /**
         * Remove and return the top element.
         */
        public int pop() {

            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }

            return list.remove(list.size() - 1);
        }

        /**
         * Return the top element without removing it.
         */
        public int peek() {

            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack elements (Top to Bottom):");

        // Print and remove elements
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
