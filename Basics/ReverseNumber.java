package basics;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int reverse = 0;
        int temp = input;

        // Loop to reverse the number
        while (temp != 0) {
            int lastDigit = temp % 10;          // Extract last digit
            reverse = reverse * 10 + lastDigit; // Build reversed number
            temp = temp / 10;                  // Remove last digit
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
