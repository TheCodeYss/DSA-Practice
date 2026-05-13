import java.util.HashSet;

/**
 * This program prints all unique subsequences
 * of a string using recursion and HashSet.
 */

public class UniqueSubsequencesUsingRecursion {

    // Recursive method
    public static void printUniqueSubsequences(
            String str,
            String newString,
            int index,
            HashSet<String> set) {

        // Base condition
        if (index == str.length()) {

            // Print only unique subsequences
            if (!set.contains(newString)) {

                System.out.println(newString);

                set.add(newString);
            }

            return;
        }

        char currentChar = str.charAt(index);

        // Add current character
        printUniqueSubsequences(
                str,
                newString + currentChar,
                index + 1,
                set);

        // Do not add current character
        printUniqueSubsequences(
                str,
                newString,
                index + 1,
                set);
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        printUniqueSubsequences("aaa", "", 0, set);
    }
}
