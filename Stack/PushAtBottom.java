package Stack;

import java.util.Stack;

/**
 * Push Element at Bottom of Stack using Recursion
 *
 * Instead of pushing an element on the top,
 * this program inserts the element at the bottom
 * of the stack using recursion.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n) (Recursion Stack)
 */
public class PushAtBottom {

    /**
     * Inserts an element at the bottom of the stack.
     */
    public static void pushAtBottom(int data, Stack<Integer> stack) {

        // Base Case:
        // If stack is empty, insert the new element.
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

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Insert 4 at the bottom
        pushAtBottom(4, stack);

        System.out.println("Stack elements (Top to Bottom):");

        // Print the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
