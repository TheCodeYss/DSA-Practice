import java.util.*;
/**

* This program toggles the case of each character in a string.
* It uses ASCII values to convert:
* Uppercase to lowercase and lowercase to uppercase.
  */

  public class ToggleCaseDemo {

  public static void main(String[] args) {

   String str = "hello";
   String result = "";

   for (int i = 0; i < str.length(); i++) {

       char ch = str.charAt(i);

       // If uppercase → convert to lowercase (+32)
       if (ch >= 'A' && ch <= 'Z') {
           result = result + (char) (ch + 32);
       }

       // If lowercase → convert to uppercase (-32)
       else if (ch >= 'a' && ch <= 'z') {
           result = result + (char) (ch - 32);
       }

       // Keep other characters unchanged
       else {
           result = result + ch;
       }
   }

   System.out.println("Toggled string: " + result);

  }
  }
