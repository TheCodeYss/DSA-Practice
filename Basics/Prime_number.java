import java.util.*;

public class Prime_number {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number to check (prime or not): ");
        int n = sc.nextInt();

        // Numbers <= 1 are neither prime nor composite
        if (n <= 1) {
            System.out.println("Neither prime nor composite");
        } else {

            // Assume number is prime initially
            boolean isPrime = true;

            // Calculate square root once
            int limit = (int) Math.sqrt(n);

            // Loop from 2 to sqrt(n)
            for (int i = 2; i <= limit; i++) {

                // If divisible, then not prime
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print result
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

        // Close scanner
        sc.close();
    }
}
