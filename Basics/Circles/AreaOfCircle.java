import java.util.Scanner;

/**

* Calculates the area of a circle.
* Formula: Area = π × r × r

  */

public class AreaOfCircle {
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    double radius = sc.nextDouble();

    // Calculate area using the formula; Math.PI returns a double value
    double area = Math.PI * radius * radius;

    System.out.println("Area of the circle = " + area);

    // Close the scanner to prevent resource leaks
    sc.close();

}


}
