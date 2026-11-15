// First and Last Occurrence of a key in an array using recursion
//
// Example: arr = {3, 5, 1, 5, 2}, key = 5
// First occurrence -> 1
// Last occurrence  -> 3
// (if the key is not present, the answer is -1)
//
// Time Complexity  : O(n)
// Space Complexity : O(n)  (recursion call stack)

public class FirstAndLastOccurrenceArray {

    /**
     * Approach 1: First occurrence (left to right)
     *
     * Logic:
     * 1. Start at i = 0.
     * 2. Check the current element first. If it matches the key, return i.
     * 3. If not, move forward to i + 1.
     * 4. The first match from the left is the first occurrence.
     */
    public static int firstOccurrence(int[] arr, int key, int i) {

        // Base case: reached the end, key not found
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }

    /**
     * Approach 2: Last occurrence (right to left)
     *
     * Logic:
     * 1. Start from the last index (arr.length - 1).
     * 2. Check the current element first. If it matches the key, return i.
     *    We are coming from the right, so the first match is the last occurrence.
     * 3. If not, move backward to i - 1.
     */
    public static int lastOccurrenceBackward(int[] arr, int key, int i) {

        // Base case: went past index 0, key not found
        if (i < 0) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return lastOccurrenceBackward(arr, key, i - 1);
    }

    /**
     * Approach 3: Last occurrence (left to right, using stack unwinding)
     *
     * Logic:
     * 1. Start at i = 0 and go deep to the end of the array first.
     * 2. Base case: i == arr.length returns -1.
     * 3. While the calls return (right to left), check two things:
     *    - Was a match already found further right? Then pass it up.
     *    - If not, is the current element the key? Then return i.
     * 4. The match found deepest is passed up first, so it is the last occurrence.
     */
    public static int lastOccurrenceForward(int[] arr, int key, int i) {

        // Base case: reached the end, key not found
        if (i == arr.length) {
            return -1;
        }

        // Go deep first
        int foundIndex = lastOccurrenceForward(arr, key, i + 1);

        // A match already found on the right is the last occurrence
        if (foundIndex != -1) {
            return foundIndex;
        }

        // Otherwise check the current element
        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 5, 2};
        int key = 5;

        System.out.println("First occurrence         : " + firstOccurrence(arr, key, 0));
        System.out.println("Last occurrence (back)   : " + lastOccurrenceBackward(arr, key, arr.length - 1));
        System.out.println("Last occurrence (forward): " + lastOccurrenceForward(arr, key, 0));

        // Key not present
        System.out.println("Key 9 (not present)      : " + firstOccurrence(arr, 9, 0));
    }
}
