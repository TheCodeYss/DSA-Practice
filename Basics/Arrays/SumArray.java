import java.util.*;

public class SumArray {
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
        int sum = 0;

        // input + sum calculation
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array = " + sum);

        sc.close();
    }
}
