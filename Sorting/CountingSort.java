// Counting Sort
//
// Note: this version works only for non-negative integers
// (a negative number would give an invalid array index).
// It is efficient only when k (the largest value) is not much bigger than n.
// Good for: marks 0 to 100.  Bad for: {1, 1000000} (huge count array for 2 numbers).
//
// Idea: instead of comparing elements, count how many times each number appears,
// then write the numbers back in order.
//
// Example: arr = {1, 4, 1, 2, 7, 5, 2}
// count[] after counting (index = number, value = how many times it appears):
// index : 0 1 2 3 4 5 6 7
// count : 0 2 2 0 1 1 0 1
// Writing back in order gives: 1 1 2 2 4 5 7
//
// Time Complexity  : O(n + k)   (n = number of elements, k = largest value)
// Space Complexity : O(k)       (the count array)
//
// Note: this version works only for non-negative integers,
// and it is efficient only when k (the largest value) is not much bigger than n.

public class CountingSort {

    public static void countingSort(int[] arr) {

        // Nothing to sort
        if (arr.length == 0) {
            return;
        }

        // Step 1: find the largest value, it decides the size of the count array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: count how many times each number appears
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3: write the numbers back into arr in sorted order
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            // number i appears count[i] times
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 2, 7, 5, 2};

        System.out.println("Before sorting:");
        printArray(arr);

        countingSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}