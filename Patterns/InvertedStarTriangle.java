// Inverted star triangle (n = 4):
// ****
// ***
// **
// *
//
// Time Complexity  : O(n^2)
// Space Complexity : O(1)

public class InvertedStarTriangle {

    public static void printInvertedStar(int n) {

        // each row has i stars, and i decreases by 1
        for (int i = n; i >= 1; i--) {

            // print i stars in this row
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // go to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printInvertedStar(4);
    }
}