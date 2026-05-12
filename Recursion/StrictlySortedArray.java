/**
 * This program checks whether an array
 * is strictly sorted using recursion.
 */

public class StrictlySortedArray {

    // Recursive method
    public static boolean isSorted(int arr[], int index) {

        // Base condition
        if (index == arr.length - 1) {
            return true;
        }

        // Check current pair
        if (arr[index] < arr[index + 1]) {
            // Return recursive result during backtracking
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(isSorted(arr, 0));
    }
}
