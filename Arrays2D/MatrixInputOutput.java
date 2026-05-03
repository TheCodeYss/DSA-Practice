import java.util.Scanner;

/**

* This program takes input for a 2D matrix (rows and columns)
* and prints the matrix in row-wise format.
  */
  public class MatrixInputOutput {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read number of rows and columns
   System.out.print("Enter number of rows: ");
   int row = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int col = sc.nextInt();

   int[][] matrix = new int[row][col];

   // Input matrix elements
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           matrix[i][j] = sc.nextInt();
       }
   }

   // Print matrix
   System.out.println("Matrix:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           System.out.print(matrix[i][j] + " ");
       }
       System.out.println();
   }

   sc.close();
  
  }
