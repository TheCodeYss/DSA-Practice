/**

* This program prints numbers from N to 1
* using recursion.
  */

  public class PrintNumbersNTo1 {

  // Recursive method
  public static void printNumbers(int n) {

   // Base condition
   if (n == 0) {
       return;
   }

   // Print current number
   System.out.println(n);

   // Recursive call
   printNumbers(n - 1);

  }

  public static void main(String[] args) {

   int n = 5;

   printNumbers(n);

  }
  }
