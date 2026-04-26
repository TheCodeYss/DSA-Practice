import java.util.Scanner;

/**
 * This program prints all even numbers from 1 up to a user-provided positive integer.
 */

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Even numbers from 1 to " + number + " are:");

            for (int i = 1; i <= number; i++) {
                // A number is even if it is divisible by 2 (i % 2 == 0)
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}
