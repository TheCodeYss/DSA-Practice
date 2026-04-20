import java.util.*;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take full line input (sentence)
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();  // remove extra spaces at start/end

        int count = 0;

        // Traverse each character
        for(int i = 0; i < str.length(); i++){

            // Word start condition:
            // 1. Current char is not space
            // 2. AND (it is first character OR previous char is space)
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) == ' ')){
                count++;  // new word detected
            }
        }

        // Output result
        System.out.println("Words = " + count);

        sc.close();
    }
}
