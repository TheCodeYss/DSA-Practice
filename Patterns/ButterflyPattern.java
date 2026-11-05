// Butterfly pattern:
//
// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class ButterflyPattern {

    public static void printPattern(int n) {

        // First half of butterfly
        for (int i = 1; i <= n; i++) {

            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between wings
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }


        // Second half of butterfly
        // Starts from n-1 to avoid repeating the middle row
        for (int i = n - 1; i >= 1; i--) {

            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between wings
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }


    public static void main(String[] args) {

        printPattern(4);

    }
}