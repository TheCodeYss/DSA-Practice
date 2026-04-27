import java.util.Scanner;
/**

* This program reads a string from the user
* and prints the frequency of each character.
* It avoids duplicate counting and skips spaces.
  */
  public class CharacterFrequency {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read input string
   System.out.print("Enter a string: ");
   String str = sc.nextLine().toLowerCase();

   for (int i = 0; i < str.length(); i++) {

       char ch = str.charAt(i);

       // Skip spaces
       if (ch == ' ') continue;

       int count = 0;

       // Skip if already counted
       boolean alreadyCounted = false;
       for (int j = 0; j < i; j++) {
           if (str.charAt(j) == ch) {
               alreadyCounted = true;
               break;
           }
       }

       if (alreadyCounted) continue;

       // Count frequency
       for (int k = 0; k < str.length(); k++) {
           if (str.charAt(k) == ch) {
               count++;
           }
       }

       System.out.println(ch + " = " + count);
   }

   sc.close();

  }
  }
