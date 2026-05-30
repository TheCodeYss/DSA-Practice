package OOPS;

/**
 * This program demonstrates
 * inheritance in Java.
 *
 * Types of Inheritance:
 *
 * 1. Single Inheritance
 *    Shape -> Triangle
 *
 * 2. Multilevel Inheritance
 *    Shape -> Triangle -> RightTriangle
 *
 * 3. Hierarchical Inheritance
 *    Shape -> Triangle
 *          -> Circle
 *
 * 4. Hybrid Inheritance
 *    Combination of two or more inheritance types.
 *    Java does not support hybrid inheritance directly
 *    using classes because multiple inheritance is not allowed.
 *    Hybrid inheritance can be achieved using interfaces.
 */

// Parent class
class Shape {

    public void displayArea() {
        System.out.println("Displays Area");
    }
}

// Single Inheritance
// Triangle inherits Shape
class Triangle extends Shape {

    public void area(int base, int height) {

        System.out.println(
                (1.0 / 2) * base * height);
    }
}

// Multilevel Inheritance
// RightTriangle inherits Triangle
class RightTriangle extends Triangle {

}

// Hierarchical Inheritance
// Circle also inherits Shape
class Circle extends Shape {

    public void area(int radius) {

        System.out.println(
                3.14 * radius * radius);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        System.out.println("Triangle:");

        Triangle t1 = new Triangle();

        t1.displayArea();
        t1.area(10, 10);

        System.out.println();

        System.out.println("Right Triangle:");

        RightTriangle rt = new RightTriangle();

        rt.displayArea();
        rt.area(8, 6);

        System.out.println();

        System.out.println("Circle:");

        Circle c1 = new Circle();

        c1.displayArea();
        c1.area(5);
    }
}
