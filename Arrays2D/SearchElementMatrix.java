import java.util.Scanner;

/**

* This program searches for an element in a 2D matrix.
* If found, it prints its position (row, column).
  */

  public class SearchElementMatrix {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read rows and columns
   System.out.print("Enter number of rows: ");
   int rows = sc.nextInt();

   System.out.print("Enter number of columns: ");
   int cols = sc.nextInt();

   int[][] matrix = new int[rows][cols];

   // Input matrix elements
   System.out.println("Enter matrix elements:");
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           matrix[i][j] = sc.nextInt();
       }
   }

   // Element to search
   System.out.print("Enter element to search: ");
   int key = sc.nextInt();

   // Search logic
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {

           // If element found → print position and exit program
           if (matrix[i][j] == key) {
               System.out.println("Element found at index: " + i + " " + j);
               sc.close();
               return; // stops entire program (better than break in nested loops)
           }
       }
   }

   // If not found after full traversal
   System.out.println("Element not found");

   sc.close();

  }
  }
