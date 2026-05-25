/**
 * This program solves Sudoku
 * using recursion and backtracking.
 */

public class SudokuSolver {

    // Check if number can be placed safely
    public static boolean isSafe(
            char[][] board,
            int row,
            int col,
            int num) {

        // Convert int -> char
        char ch = (char) (num + '0');

        // Check same row
        for (int j = 0; j < 9; j++) {

            // Same number already exists in row
            if (board[row][j] == ch) {
                return false;
            }
        }

        // Check same column
        for (int i = 0; i < 9; i++) {

            // Same number already exists in column
            if (board[i][col] == ch) {
                return false;
            }
        }

        // Find starting index of 3x3 grid
        int rowStart = (row / 3) * 3;
        int colStart = (col / 3) * 3;

        // Check inside 3x3 grid
        for (int i = rowStart; i < rowStart + 3; i++) {

            for (int j = colStart; j < colStart + 3; j++) {

                // Number already exists in grid
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        // Safe to place number
        return true;
    }

    // Solve Sudoku using recursion + backtracking
    public static boolean solveSudoku(
            char[][] board,
            int row,
            int col) {

        // All rows completed -> Sudoku solved
        if (row == 9) {
            return true;
        }

        int nextRow;
        int nextCol;

        // Move to next cell
        if (col != 8) {

            // Move right
            nextRow = row;
            nextCol = col + 1;

        } else {

            // Move to next row
            nextRow = row + 1;
            nextCol = 0;
        }

        // Skip already filled cells
        if (board[row][col] != '.') {

            // Whatever next call returns,
            // return same
            return solveSudoku(
                    board,
                    nextRow,
                    nextCol);
        }

        // Try numbers from 1 to 9
        for (int i = 1; i <= 9; i++) {

            // Check if current number is valid
            if (isSafe(board, row, col, i)) {

                // Place number temporarily
                board[row][col] =
                        (char) (i + '0');

                // Ask recursion to solve remaining board
                if (solveSudoku(
                        board,
                        nextRow,
                        nextCol)) {

                    // If solved further,
                    // stop everything
                    return true;
                }

                // Future failed
                // Remove number
                board[row][col] = '.';
            }
        }

        // No number worked here
        return false;
    }

    // Print final Sudoku
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Start solving from (0,0)
        if (solveSudoku(board, 0, 0)) {

            System.out.println("Solved Sudoku:\n");

            printBoard(board);

        } else {

            // No valid solution exists
            System.out.println("No solution exists");
        }
    }
}
