import java.util.Scanner;

/**

* This program takes input for a 2D matrix
* and calculates the sum of all elements.
  */

  public class MatrixSum {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read rows and columns
   System.out.print("Enter number of rows: ");
   int row = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int col = sc.nextInt();

   int[][] matrix = new int[row][col];
   int sum = 0;

   // Input matrix and calculate sum
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           matrix[i][j] = sc.nextInt();
           sum += matrix[i][j];
       }
   }

   // Print result
   System.out.println("Sum of all elements: " + sum);

   sc.close();


  }
  }
