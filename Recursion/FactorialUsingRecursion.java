/**
 * This program finds factorial of a number
 * using parameterized recursion.
 */

public class FactorialUsingRecursion {

    // Recursive method
    public static void printFactorial(int n, int fact) {

        // Base condition
        if (n == 0) {
            System.out.println("Factorial = " + fact);
            return;
        }

        // Update factorial
        fact *= n;

        // Recursive call
        printFactorial(n - 1, fact);
    }

    public static void main(String[] args) {

        printFactorial(5, 1);
    }
}
