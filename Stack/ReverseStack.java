package Stack;

import java.util.Stack;

/**
 * Reverse a Stack using Recursion.
 *
 * This program reverses the elements of a stack
 * without using any extra data structure.
 *
 * It uses a helper method (pushAtBottom)
 * to insert elements at the bottom of the stack.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(n) (Recursion Stack)
 */
public class ReverseStack {

    /**
     * Inserts an element at the bottom of the stack.
     */
    public static void pushAtBottom(int data, Stack<Integer> stack) {

        // Base case: stack is empty
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively move towards the bottom
        pushAtBottom(data, stack);

        // Restore the removed element
        stack.push(top);
    }

    /**
     * Reverses the stack using recursion.
     */
    public static void reverse(Stack<Integer> stack) {

        // Base case: empty stack
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Reverse the remaining stack
        reverse(stack);

        // Place removed element at the bottom
        pushAtBottom(top, stack);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack (Top to Bottom):");

        Stack<Integer> temp = (Stack<Integer>) stack.clone();
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }

        // Reverse the stack
        reverse(stack);

        System.out.println("\nReversed Stack (Top to Bottom):");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
