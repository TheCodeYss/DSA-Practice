package strings.modification;

import java.util.Scanner;

/**

* This program reads a string from the user
* and removes all spaces from it.
  */

  public class RemoveSpaces {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read input string from the user
   System.out.print("Enter a string: ");
   String str = sc.nextLine();

   String result = "";

   // Remove spaces from the string
   for (int i = 0; i < str.length(); i++) {
       if (str.charAt(i) != ' ') {
           result = result + str.charAt(i);
       }
   }
   
   // Print result without spaces
   System.out.println("String without spaces: " + result);

   sc.close();

  }
  }
