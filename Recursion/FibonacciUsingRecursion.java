/**
 * This program prints Fibonacci series
 * using recursion.
 */

public class FibonacciUsingRecursion {

    // Recursive method
    public static void fibonacci(int a, int b, int n) {

        // Base condition
        if (n == 0) {
            return;
        }

        int c = a + b;

        System.out.println(c);

        // Recursive call
        fibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int n = 7;

        System.out.println(a);
        System.out.println(b);

        fibonacci(a, b, n - 2);
    }
}
