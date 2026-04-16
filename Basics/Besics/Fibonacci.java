import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input: how many numbers you want
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // handle invalid input
        if (n <= 0) {
            System.out.println("Enter a positive number");
        } else {

            int f1 = 0, f2 = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(f1 + " ");

                int next = f1 + f2;
                f1 = f2;
                f2 = next;
            }
        }

        sc.close();
    }
}
