package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int input = sc.nextInt();

        int fact = 1;

        if (input < 0) {
            System.out.println("Invalid input. Factorial is not defined for negative numbers.");
        } else if (input == 0) {
            System.out.println("Factorial: 1");
        } else {
            for (int i = 1; i <= input; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial: " + fact);
        }

        sc.close();
    }
}
