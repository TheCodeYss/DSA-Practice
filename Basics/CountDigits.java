import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        int count = 0;

        // Special case for 0
        if (number == 0) {
            count = 1;
        }

        // Count digits
        while (number > 0) {
            number /= 10;  // Remove last digit
            count++;       // Increment count
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
