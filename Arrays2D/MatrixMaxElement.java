import java.util.Scanner;

/**

* This program finds the maximum element
* in a 2D matrix.
  */

  public class MatrixMaxElement {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read rows and columns
   System.out.print("Enter number of rows: ");
   int row = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int col = sc.nextInt();

   int[][] matrix = new int[row][col];

   // Input matrix
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           matrix[i][j] = sc.nextInt();
       }
   }

   // Initialize max with first element
   int max = matrix[0][0];

   // Find maximum element
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           if (matrix[i][j] > max) {
               max = matrix[i][j];
           }
       }
   }

   // Print result
   System.out.println("Maximum element: " + max);

   sc.close();

  }
  }
