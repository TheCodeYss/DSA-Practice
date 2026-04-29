import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Unique elements:");

        for (int i = 0; i < arr.length; i++) {

            // Skip elements that are already processed
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                // Compare only with next elements to avoid self-comparison and repeated checks
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // Print elements that appear only once
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
