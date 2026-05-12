/**
 * This program finds the first and last occurrence
 * of a character in a string using recursion.
 */

public class FirstAndLastOccurrence {

    static int first = -1;
    static int last = -1;

    // Recursive method
    public static void findOccurrence(String str, char target, int index) {

        // Base condition
        if (index == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        // Check current character
        if (str.charAt(index) == target) {

            // Store first occurrence
            if (first == -1) {
                first = index;
            }

            // Update last occurrence
            last = index;
        }

        // Recursive call
        findOccurrence(str, target, index + 1);
    }

    public static void main(String[] args) {

        String str = "aabbabdjdndujdba";

        findOccurrence(str, 'a', 0);
    }
}
