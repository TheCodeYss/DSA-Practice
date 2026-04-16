import java.util.*;

public class Even_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input: range limit
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // handle invalid input
        if (n <= 0) {
            System.out.println("Enter a positive number");
        } else {

            // print even numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
