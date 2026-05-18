/**
 * This program counts the number of ways
 * to place tiles using recursion.
 */

public class PlaceTiles {

    // Recursive method
    public static int placeTiles(int n, int m) {

        // Base condition
        if (n == m) {
            return 2;
        }

        // Tile cannot be placed horizontally
        if (n < m) {
            return 1;
        }

        // Place tile vertically
        int verticalPlacements =
                placeTiles(n - m, m);

        // Place tile horizontally
        int horizontalPlacements =
                placeTiles(n - 1, m);

        // Total ways
        return verticalPlacements +
               horizontalPlacements;
    }

    public static void main(String[] args) {

        int ways = placeTiles(4, 2);

        System.out.println(ways);
    }
}
