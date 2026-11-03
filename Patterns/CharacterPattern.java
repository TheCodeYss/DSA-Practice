// Character pattern
// Pattern for n = 4:
//
// A
// BC
// DEF
// GHIJ
//
// Time Complexity  : O(n^2)
// Space Complexity : O(1)

public class CharacterPattern {

    // Prints increasing character pattern
    public static void charPattern(int n) {

        // Starting character
        char ch = 'A';

        // Controls rows
        for (int i = 1; i <= n; i++) {

            // Prints characters in each row
            for (int j = 1; j <= i; j++) {

                System.out.print(ch);

                // Move to next character
                ch++;
            }

            // Move to next line after each row
            System.out.println();
        }
    }


    public static void main(String[] args) {

        // Number of rows
        charPattern(4);
    }
}