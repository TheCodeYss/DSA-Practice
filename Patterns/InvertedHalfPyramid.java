// Inverted half pyramid number pattern:
//
// 12345
// 1234
// 123
// 12
// 1
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class InvertedHalfPyramid {

    public static void printPattern(int n) {

        // Outer loop controls rows (decreasing order)
        for (int i = n; i >= 1; i--) {

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(5);

    }
}