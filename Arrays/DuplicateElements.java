import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // Skip elements that are already processed
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    /*
                     * Mark duplicate elements as visited.
                     * We mark j (future elements), not i (current element),
                     * so duplicates are not counted again.
                     */
                    visited[j] = true;
                }
            }

            // Print duplicate elements
            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
