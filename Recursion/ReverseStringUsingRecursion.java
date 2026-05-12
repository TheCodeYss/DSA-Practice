/**
 * This program reverses a string
 * using recursion.
 */

public class ReverseStringUsingRecursion {

    // Recursive method
    public static String reverseString(String str) {

        // Base condition
        if (str.length() == 1) {
            return str;
        }

        // Store current character
        char currentChar = str.charAt(0);

        // Recursive call on remaining string
        String remainingString = reverseString(str.substring(1));

        // Build reversed string
        return remainingString + currentChar;
    }

    public static void main(String[] args) {

        String str = "abcd";

        String reversed = reverseString(str);

        System.out.println(reversed);
    }
}
