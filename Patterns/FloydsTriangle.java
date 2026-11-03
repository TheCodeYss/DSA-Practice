// Floyd's triangle pattern:
//
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
//
// Time Complexity  : O(n²)
// Space Complexity : O(1)

public class FloydsTriangle {

    public static void printPattern(int n) {

        int number = 1;

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints numbers in each row
            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;
            }

            // Move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(5);

    }
}