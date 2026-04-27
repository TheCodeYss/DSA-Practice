import java.util.Scanner;

/**

* This program reads a string from the user
* and prints the reversed string.
  */
  public class ReverseString {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read input string from the user
   System.out.print("Enter string: ");
   String str = sc.nextLine();

   // Print characters in reverse order
   System.out.print("Reversed string: ");
   for (int i = str.length() - 1; i >= 0; i--) {
       System.out.print(str.charAt(i));
   }

   sc.close();

  }
  }
