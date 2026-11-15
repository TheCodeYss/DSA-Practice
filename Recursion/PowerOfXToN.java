// Power of x to n (x^n) using recursion
//
// Example: power(2, 5)          -> 32
//          optimizedPower(2, 10) -> 1024
//
// Two approaches:
// 1. Normal recursion    -> Time O(n),     Space O(n)
// 2. Optimized recursion -> Time O(log n), Space O(log n)

// Note: int can hold values only up to 2,147,483,647 (2^31 - 1).
// For bigger results (like 2^31), the answer overflows. Use long instead.
public class PowerOfXToN {

    /**
     * Approach 1: Normal recursion
     *
     * Logic:
     * x^n = x * x^(n-1)
     * Example: 2^5 = 2 * 2^4
     *
     * The power reduces by only 1 each time, so there are n calls.
     */
    public static int power(int x, int n) {

        // Base case: any number raised to 0 is 1
        if (n == 0) {
            return 1;
        }

        // Base case: 0 raised to any positive power is 0
        if (x == 0) {
            return 0;
        }

        // Get x^(n-1), then multiply by x once more
        int previousPower = power(x, n - 1);

        return x * previousPower;
    }

    /**
     * Approach 2: Optimized recursion (divide the power by 2)
     *
     * Logic:
     * If n is even : x^n = x^(n/2) * x^(n/2)
     * If n is odd  : x^n = x * x^(n/2) * x^(n/2)
     * Example: 2^10 = 2^5 * 2^5      2^5 = 2 * 2^2 * 2^2
     *
     * IMPORTANT: calculate x^(n/2) only ONCE and store it in a variable.
     * If we write optimizedPower(x, n/2) * optimizedPower(x, n/2),
     * the recursion makes 2 calls each time and the time becomes O(n) again.
     *
     * The power halves every call, so there are only log n calls.
     */
    public static int optimizedPower(int x, int n) {

        // Base case: any number raised to 0 is 1
        if (n == 0) {
            return 1;
        }

        // Base case: 0 raised to any positive power is 0
        if (x == 0) {
            return 0;
        }

        // Calculate x^(n/2) only once
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSquare = halfPower * halfPower;

        // If n is odd, multiply one extra x
        if (n % 2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;
    }

    public static void main(String[] args) {

        System.out.println("Normal    2^5  : " + power(2, 5));
        System.out.println("Optimized 2^5  : " + optimizedPower(2, 5));
        System.out.println("Optimized 2^10 : " + optimizedPower(2, 10));
        System.out.println("Optimized 3^3  : " + optimizedPower(3, 3));
        System.out.println("Optimized 2^0  : " + optimizedPower(2, 0));
    }
}
