// Hollow Rectangle Pattern
//
// Input: n = 4, m = 5
//
// *****
// *   *
// *   *
// *****
//
// Time Complexity  : O(n * m)
// Space Complexity : O(1)

public class HollowRectangle {

    // Method to print hollow rectangle pattern
    public static void pattern(int n, int m) {

        // Rows
        for (int i = 1; i <= n; i++) {

            // Columns
            for (int j = 1; j <= m; j++) {

                // Print star on boundary
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                }

                // Print space inside rectangle
                else {
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern(4, 5);

    }
}