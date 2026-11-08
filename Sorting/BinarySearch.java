// Binary Search
//
// Searches for a key in a sorted array.
//
// Time Complexity  : O(log n)
// Space Complexity : O(1)

public class BinarySearch {

    public static int binarySearch(int[] numbers, int key) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {

            // Calculate middle index
            int mid = start + (end - start) / 2;

            // Key found
            if (numbers[mid] == key) {
                return mid;
            }

            // Search in right half
            if (numbers[mid] < key) {
                start = mid + 1;
            }

            // Search in left half
            else {
                end = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 14;

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}