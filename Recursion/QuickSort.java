/**
 * This program sorts an array
 * using Quick Sort.
 *
 * Quick Sort uses:
 * 1. Pivot element
 * 2. Partitioning
 * 3. Recursion
 *
 * Smaller elements move left.
 * Greater elements move right.
 */

public class QuickSort {

    // Partition method
    public static int partition(
            int arr[],
            int low,
            int high) {

        // Last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        // Swap till pivot
        // Before pivot all smaller elements
        // are moved left side
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Suppose pivot is 9
        // Array is right now:
        // [6,3,5,2,8,10,9]

        // Now when you do i++
        // you move to pivot position
        i++;

        // Swap pivot to correct position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        // Now array becomes:
        // [6,3,5,2,8,9,10]

        // Return pivot index
        return i;
    }

    // Recursive Quick Sort
    public static void quickSort(
            int arr[],
            int low,
            int high) {

        // Base condition
        if (low < high) {

            // Find pivot index
            int pivotIndex =
                    partition(arr, low, high);

            // Sort left half
            quickSort(
                    arr,
                    low,
                    pivotIndex - 1);

            // Sort right half
            quickSort(
                    arr,
                    pivotIndex + 1,
                    high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 5, 2, 8, 9};

        // Start Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
