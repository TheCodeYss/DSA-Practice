/**
 * This program prints all subsequences
 * of a string using recursion.
 */

public class SubsequencesUsingRecursion {

    // Recursive method
    public static void printSubsequences(String str, String newString, int index) {

        // Base condition
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        // Add current character
        printSubsequences(str, newString + currentChar, index + 1);

        // Do not add current character
        printSubsequences(str, newString, index + 1);
    }

    public static void main(String[] args) {

        printSubsequences("ab", "", 0);
    }
}
