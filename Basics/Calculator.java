import java.util.Scanner;

/**

* A simple Java calculator that performs basic arithmetic operations.
* Supports +, -, *, /, and % operations.
  */

public class Calculator {
public static void main(String[] args) {

  // Create Scanner object to take input from user
    Scanner sc = new Scanner(System.in);

    char choice; // To store user's choice for repeating the program

    // Loop runs at least once and continues based on user input
    do {
        System.out.println("\n========== JAVA BASIC CALCULATOR ==========");

        // Taking input numbers
        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();

        // Taking operator input
        System.out.print("Enter operation (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        // Perform operation based on user input
        switch (operator) {

            case '+':
                System.out.println("Addition = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                // Check to avoid division by zero
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    System.out.println("Division = " + (a / b));
                }
                break;

            case '%':
                System.out.println("Remainder = " + (a % b));
                break;

            default:
                System.out.println("Invalid operator entered");
        }

        // Ask user if they want to continue
        System.out.print("\nDo you want to continue? (y/n): ");
        choice = sc.next().charAt(0);

    } while (choice == 'y' || choice == 'Y');

    // Close scanner to prevent resource leak
    sc.close();
}

}
