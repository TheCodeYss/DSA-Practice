import java.util.ArrayList;

/**
 * This program prints all subsets
 * using recursion and backtracking.
 */

public class SubsetsUsingRecursion {

    // Print subset
    public static void printSubset(ArrayList<Integer> subset) {

        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }

        System.out.println();
    }

    // Recursive method
    public static void findSubsets(
            int n,
            ArrayList<Integer> subset) {

        // Base condition
        if (n == 0) {

            printSubset(subset);
            return;
        }

        // Include current number
        subset.add(n);

        findSubsets(n - 1, subset);

        // Backtracking
        subset.remove(subset.size() - 1);

        // Exclude current number
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {

        int n = 3;

        findSubsets(n, new ArrayList<Integer>());
    }
}
