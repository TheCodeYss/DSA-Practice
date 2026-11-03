// Binary triangle (0-1 triangle) pattern:
//
// 1
// 01
// 101
// 0101
// 10101
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class BinaryTriangle {

    public static void printPattern(int n) {

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints values in each row
            for (int j = 1; j <= i; j++) {

                // If sum of row and column is even, print 1
                // Otherwise print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
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