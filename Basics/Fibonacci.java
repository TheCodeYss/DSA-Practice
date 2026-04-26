import java.util.Scanner;

/**
 * This program prints the Fibonacci sequence up to a user-defined number of terms.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 1;

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        //invalid input
        if (terms <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci sequence:");

            for (int i = 0; i < terms; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
