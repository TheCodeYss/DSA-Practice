import java.util.*;

public class SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // handle invalid input
        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[n];

        // input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        // result
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
