public class HalfPyramid {

    // Prints half pyramid number pattern
    public static void pattern(int n) {

        for(int i = 1; i <= n; i++) {

            // Print numbers from 1 to current row number
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern(4);

    }
}