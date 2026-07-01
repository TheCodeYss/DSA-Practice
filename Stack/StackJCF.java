package Stack;

import java.util.Stack;

/**
 * Stack Implementation using Java Collections Framework (JCF)
 *
 * Stack follows the LIFO (Last In, First Out) principle.
 *
 * Operations Used:
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
public class StackJCF {

    public static void main(String[] args) {

        // Create a stack using Java Collections Framework
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
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
