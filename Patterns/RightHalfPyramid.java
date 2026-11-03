// Right half pyramid pattern:
//
//    *
//   **
//  ***
// ****
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class RightHalfPyramid {

    public static void printPattern(int n) {

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}