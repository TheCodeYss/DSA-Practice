/**
 * This program prints numbers from 1 to N
 * using recursion.
 */

public class PrintNumbers1ToN {

    // Recursive method
    public static void printNumbers(int current, int n) {

        // Base condition
        if (current > n) {
            return;
        }

        // Print current number
        System.out.println(current);

        // Recursive call
        printNumbers(current + 1, n);
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(1, n);
    }
}
