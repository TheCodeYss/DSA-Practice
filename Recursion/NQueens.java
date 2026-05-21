import java.util.*;

public class NQueens {

    // Recursive function:
    // Try placing one queen in every column
    public static void helper(
            char board[][],
            List<List<String>> allBoards,
            int col) {

        // Base case:
        // If all columns are filled,
        // one valid solution is found
        if (col == board.length) {

            saveBoard(board, allBoards);
            return;
        }

        // Try every row for current column
        for (int row = 0; row < board.length; row++) {

            // Check if current position is safe
            if (isSafe(row, col, board)) {

                // Choose
                // Place queen
                board[row][col] = 'Q';

                // Explore next column recursively
                helper(board, allBoards, col + 1);

                // Backtracking
                // Remove queen and try another row
                board[row][col] = '.';
            }
        }
    }

    // Check whether queen can be placed safely
    public static boolean isSafe(
            int row,
            int col,
            char[][] board) {

        // Check entire row
        for (int i = 0; i < board.length; i++) {

            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // Check entire column
        for (int j = 0; j < board.length; j++) {

            if (board[j][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        int c = col;

        // Check upper-left diagonal
        while (r >= 0 && c >= 0) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c--;
        }

        r = row;
        c = col;

        // Check upper-right diagonal
        while (r >= 0 && c < board.length) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c++;
        }

        r = row;
        c = col;

        // Check lower-left diagonal
        while (r < board.length && c >= 0) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r++;
            c--;
        }

        r = row;
        c = col;

        // Check lower-right diagonal
        while (r < board.length && c < board.length) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r++;
            c++;
        }

        // Safe to place queen
        return true;
    }

    // Convert char board into List<String> format
    // and store final solution
    public static void saveBoard(
            char[][] board,
            List<List<String>> allBoards) {

        // Stores one complete board
        List<String> newBoard = new ArrayList<>();

        // Traverse every row
        for (int i = 0; i < board.length; i++) {

            String row = "";

            // Traverse every column
            for (int j = 0; j < board.length; j++) {

                // Build row string
                if (board[i][j] == 'Q') {
                    row = row + 'Q';
                } else {
                    row = row + '.';
                }
            }

            // Add one complete row into board
            newBoard.add(row);
        }

        // Add one complete solution
        // into all solutions
        allBoards.add(newBoard);
    }

    public static void main(String[] args) {

        int n = 4;

        // Stores all valid boards
        List<List<String>> allBoards =
                new ArrayList<>();

        // Create n x n board
        char board[][] = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                board[i][j] = '.';
            }
        }

        // Start recursion from column 0
        helper(board, allBoards, 0);

        // Print all valid solutions
        System.out.println(allBoards);
    }
}
