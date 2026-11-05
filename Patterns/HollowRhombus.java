// Hollow rhombus pattern:
//
//     *****
//    *   *
//   *   *
//  *   *
// *****
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class HollowRhombus {

    public static void printPattern(int n) {

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 1; j <= n; j++) {

                // Print boundary stars only
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }


    public static void main(String[] args) {

        printPattern(5);

    }
}
