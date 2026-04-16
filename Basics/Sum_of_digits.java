import java.util.*;

// Sum of digits
// Example: 1353 → 1 + 3 + 5 + 3 = 12

public class Sum_of_digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to sum all digits: ");
        int n = sc.nextInt();

        // handle negative numbers
        n = Math.abs(n);

        int sum = 0;

        // loop until number becomes 0
        while (n != 0) {

            int LD = n % 10;   // get last digit
            sum = sum + LD;    // add to sum
            n = n / 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
