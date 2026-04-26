import java.util.Scanner;

/**
 * This program calculates the sum of digits of a given integer.
 * Example: 1353 → 1 + 3 + 5 + 3 = 12
 */
public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative input
        number = Math.abs(number);

        int sum = 0;

        // Extract and add each digit
        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
