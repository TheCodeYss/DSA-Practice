/**
 * This program moves all occurrences
 * of a character to the end of a string
 * using recursion.
 */

public class MoveCharacterToEnd {

    // Recursive method
    public static void moveCharacter(
            String str,
            char target,
            int count,
            int index,
            String newString) {

        // Base condition
        if (index == str.length()) {

            // Add target character at the end
            for (int i = 0; i < count; i++) {
                newString = newString + target;
            }

            System.out.println(newString);
            return;
        }

        // Count target character
        if (str.charAt(index) == target) {

            count++;

        } else {

            // Add non-target character
            newString = newString + str.charAt(index);
        }

        // Recursive call
        moveCharacter(str, target, count, index + 1, newString);
    }

    public static void main(String[] args) {

        moveCharacter("aaabbxxbbxxnnx", 'x', 0, 0, "");
    }
}
