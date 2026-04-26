package basics;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int sum = 0;

        int temp = num;

        // Count number of digits
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
        }

        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;

            // Calculate digit raised to the power of total digits
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        // Handle the case where input is 0, as the loop does not execute
        if (num == 0) {
            sum = 0;
        }

        if (sum == original) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }

        sc.close();
    }
}
