/**
 * This program prints all possible
 * keypad combinations using recursion.
 */

public class KeypadCombinations {

    static String[] keypad = {
            ".", "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
    };

    // Recursive method
    public static void printCombinations(
            String str,
            int index,
            String combination) {

        // Base condition
        if (index == str.length()) {

            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(index);

        // Convert digit character to array index
        String mapping = keypad[currentChar - '0'];

        // Loop through mapped characters
        for (int i = 0; i < mapping.length(); i++) {

            // Recursive call for next digit
            printCombinations(
                    str,
                    index + 1,
                    combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        printCombinations("23", 0, "");
    }
}
