/**
 * This program calculates x raised to the power n
 * using recursion.
 */

public class PowerOfXToN {

    // Recursive method
    public static int power(int x, int n) {

        // Base condition
        if (n == 0) {
            return 1;
        }

        // If base is 0
        if (x == 0) {
            return 0;
        }

        // Recursive call
        int previousPower = power(x, n - 1);

        // Calculate current power
        int result = x * previousPower;

        return result;
    }

    public static void main(String[] args) {

        int answer = power(2, 5);

        System.out.println(answer);
    }
}
