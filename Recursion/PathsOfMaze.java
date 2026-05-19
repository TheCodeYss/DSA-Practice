/**
 * This program counts the number of paths
 * in a maze using recursion.
 */

public class PathsOfMaze {

    // Recursive method
    public static int countPaths(
            int row,
            int col,
            int n,
            int m) {

        // Out of maze boundary
        if (row == n || col == m) {
            return 0;
        }

        // Destination reached
        if (row == n - 1 && col == m - 1) {
            return 1;
        }

        // Move down
        int downPaths =
                countPaths(row + 1, col, n, m);

        // Move right
        int rightPaths =
                countPaths(row, col + 1, n, m);

        // Total paths
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {

        int paths = countPaths(0, 0, 3, 3);

        System.out.println(paths);
    }
}
