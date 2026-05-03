import java.util.Scanner;

/**

* This program calculates the sum of both diagonals
* of a square matrix.
  */

  public class DiagonalSum {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read rows and columns
   System.out.print("Enter number of rows: ");
   int row = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int col = sc.nextInt();

   // Check if matrix is square
   if (row != col) {
       System.out.println("Diagonal sum is only possible for square matrix");
       sc.close();
       return;
   }

   int[][] matrix = new int[row][col];

   int leftDiagonal = 0;
   int rightDiagonal = 0;

   // Input and calculate diagonal sums
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {

           matrix[i][j] = sc.nextInt();

           // Left diagonal
           if (i == j) {
               leftDiagonal += matrix[i][j];
           }

           // Right diagonal (avoid double count of middle element)
           if (i + j == row - 1 && i != j) {
               rightDiagonal += matrix[i][j];
           }
       }
   }

   // Print results
   System.out.println("Left diagonal sum: " + leftDiagonal);
   System.out.println("Right diagonal sum: " + rightDiagonal);

   sc.close();

  }
  }
