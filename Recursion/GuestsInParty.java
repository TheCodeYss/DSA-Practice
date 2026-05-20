/**
 * This program counts the number of ways
 * guests can attend a party
 * using recursion.
 */

public class GuestsInParty {

    // Recursive method
    public static int countWays(int n) {

        // Base condition
        if (n <= 1) {
            return 1;
        }

        // Guest stays single
        int singleWays =
                countWays(n - 1);

        // Guest pairs with another guest
        int pairWays =
                (n - 1) * countWays(n - 2);

        // Total ways
        return singleWays + pairWays;
    }

    public static void main(String[] args) {

        int ways = countWays(4);

        System.out.println(ways);
    }
}
