import java.util.Scanner;

/**

* This program reads two strings from the user
* and compares them using equals() method.
*
* Note:
* equals() compares the content of strings.
* == compares the reference (memory location), so it should be avoided for string comparison.
  */

  public class Comparison {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the first string:");
   String str1 = sc.nextLine();

   System.out.println("Enter the second string:");
   String str2 = sc.nextLine();

   // Compare both strings using equals()
   if (str1.equals(str2)) {
       System.out.println("Strings are equal");
   } else {
       System.out.println("Strings are not equal");
   }

   sc.close();

  }
  }
