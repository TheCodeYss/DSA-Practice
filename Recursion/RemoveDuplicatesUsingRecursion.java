/**
 * This program removes duplicate characters
 * from a string using recursion.
 */

public class RemoveDuplicatesUsingRecursion {

    static boolean map[] = new boolean[26];

    // Recursive method
    public static void removeDuplicates(
            String str,
            String newString,
            int index) {

        // Base condition
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        // Character not visited
        // 'c' - 'a' = 2
        // Converts alphabet character to alphabet index
        if (!map[currentChar - 'a']) {

            newString = newString + currentChar;

            map[currentChar - 'a'] = true;
        }

        // Recursive call
        removeDuplicates(str, newString, index + 1);
    }

    public static void main(String[] args) {

        removeDuplicates("aabbcde", "", 0);
    }
}
