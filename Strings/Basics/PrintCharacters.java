import java.util.Scanner;

/**
* This program reads a string from the user
* and prints each character on a new line.
  */

  public class PrintCharacters {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Read full line input from the user using nextLine()
   // Note: next() reads only a single word, while nextLine() reads the entire line
   String str = sc.nextLine();

   // Print each character of the string individually
   for (int i = 0; i < str.length(); i++) {
       System.out.println(str.charAt(i));
   }

   sc.close();

  }
  }
