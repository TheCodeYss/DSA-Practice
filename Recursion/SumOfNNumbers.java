/**
 * This program finds the sum of first N numbers
 * using recursion.
 */

public class SumOfNNumbers {

    // Recursive method
    public static int sum(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        // Recursive call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Sum = " + sum(n));
    }
}
