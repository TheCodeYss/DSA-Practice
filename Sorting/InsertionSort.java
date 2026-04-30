import java.util.*;

/**
 * Insertion Sort implementation without using a separate method.
 * Sorts an array in ascending order.
 */

class InsertionSort {
    public static void main(String args[]) {

        int arr[] = {7, 8, 1, 3, 2};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
