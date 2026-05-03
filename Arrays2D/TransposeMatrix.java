import java.util.Scanner;

/**

* This program computes the transpose of a matrix.
* Transpose converts rows into columns.
  */

  public class TransposeMatrix {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read rows and columns
   System.out.print("Enter number of rows: ");
   int rows = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int cols = sc.nextInt();

   int[][] matrix = new int[rows][cols];

   // Input matrix
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           matrix[i][j] = sc.nextInt();
       }
   }

   // Create transpose matrix
   int[][] transpose = new int[cols][rows];

   // Compute transpose
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           transpose[j][i] = matrix[i][j];
       }
   }

   // Print transpose matrix
   System.out.println("Transpose Matrix:");
   for (int i = 0; i < cols; i++) {
       for (int j = 0; j < rows; j++) {
           System.out.print(transpose[i][j] + " ");
       }
       System.out.println();
   }

   sc.close();

  }
  }
 
