package basics;

import java.util.Scanner;

/**
 * This program checks whether a given number is prime or not.
 */

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Neither prime nor composite");
        } else {

            boolean isPrime = true;
            int limit = (int) Math.sqrt(number);

            for (int i = 2; i <= limit; i++) {
                // A number is not prime if it is divisible by any number between 2 and sqrt(n)
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }

        scanner.close();
    }
}
