import java.util.Scanner;

/**

* This program reads a string from the user
* and prints each character along with its
* consecutive occurrence count.
  */

  public class CountContinuous {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter a string: ");
   String str = sc.nextLine();

   // Handle empty input
   if (str.length() == 0) {
       System.out.println("Empty string");
       sc.close();
       return;
   }

   int count = 1;

   // Traverse string
   for (int i = 0; i < str.length(); i++) {

       // Check if next character is same
       if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
           count++;
       } else {
           // Print character with its count
           System.out.print(str.charAt(i) + "" + count + " ");
           count = 1; // reset count
       }
   }

   sc.close();

  }
  }
