/**
 * This program prints all permutations
 * of a string using recursion.
 */

public class PermutationOfString {

    // Recursive method
    public static void printPermutations(String str, String combination) {

        // Base condition
        if (str.length() == 0) {

            System.out.println(combination);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // Pick current character
            char currentChar = str.charAt(i);

            // Remove current character from string
            // substring(start, end)
            // start index included, end index excluded
            String newString =
                    str.substring(0, i) +
                    str.substring(i + 1);

            // Add character in combination
            printPermutations(
                    newString,
                    combination + currentChar);
        }
    }

    public static void main(String[] args) {

        printPermutations("abc", "");
    }
}
