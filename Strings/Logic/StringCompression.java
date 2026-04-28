import java.util.Scanner;

/**

* This program reads a string from the user
* and compresses it by replacing consecutive
* characters with character followed by count.
* Example: aaabbc → a3b2c1
  */

  public class StringCompression {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter a string: ");
   String str = sc.nextLine();

   String result = "";
   int count = 1;

   // Compress string
   for (int i = 0; i < str.length(); i++) {

       if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
           count++;
       } else {
           result += str.charAt(i) + "" + count;
           count = 1;
       }
   }

   // Print compressed string
   System.out.println("Compressed string: " + result);

   sc.close();

  }
  }
