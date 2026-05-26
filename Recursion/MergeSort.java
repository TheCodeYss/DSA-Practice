/**
 * This program sorts an array
 * using Merge Sort.
 *
 * Merge Sort uses:
 * 1. Divide
 * 2. Conquer (Merge)
 *
 * Division happens top -> down
 * Merging + sorting happens bottom -> up
 */

public class MergeSort {

    // Merge two sorted halves
    public static void conquer(
            int[] arr,
            int startIndex,
            int mid,
            int endIndex) {

        // Temporary merged array
        int merged[] =
                new int[endIndex - startIndex + 1];

        // Left half pointer
        int leftIndex = startIndex;

        // Right half pointer
        int rightIndex = mid + 1;

        // Merged array index
        int x = 0;

        // Compare elements from both halves
        while (leftIndex <= mid &&
                rightIndex <= endIndex) {

            // Smaller element goes first
            if (arr[leftIndex] <= arr[rightIndex]) {

                merged[x] = arr[leftIndex];

                x++;
                leftIndex++;

            } else {

                merged[x] = arr[rightIndex];

                x++;
                rightIndex++;
            }
        }

        // Remaining left half elements
        while (leftIndex <= mid) {

            merged[x] = arr[leftIndex];

            x++;
            leftIndex++;
        }

        // Remaining right half elements
        while (rightIndex <= endIndex) {

            merged[x] = arr[rightIndex];

            x++;
            rightIndex++;
        }

        // Copy merged array
        // back into original array
        for (int i = 0, j = startIndex;
                i < merged.length;
                i++, j++) {

            arr[j] = merged[i];
        }
    }

    // Divide array recursively
    public static void divide(
            int[] arr,
            int startIndex,
            int endIndex) {

        // Base condition
        // Single element is already sorted
        if (startIndex >= endIndex) {
            return;
        }

        // Safe way to calculate mid
        int mid =
                startIndex +
                (endIndex - startIndex) / 2;

        // Divide left half
        divide(arr, startIndex, mid);

        // Divide right half
        divide(arr, mid + 1, endIndex);

        // Backtracking step:
        // Merge sorted halves
        conquer(arr, startIndex, mid, endIndex);
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 1, 2, 4};

        // Start Merge Sort
        divide(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
