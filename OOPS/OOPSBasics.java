package OOPS;

/**
 * This program demonstrates:
 * 
 * 1. Class and Object
 * 2. Properties and Methods
 * 3. this keyword
 * 4. Parameterized Constructor
 * 5. Copy Constructor
 */

// Class -> blueprint for creating objects
class Pen {

    // Properties of object
    String color;
    String type;

    // Method of object
    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {

        // this keyword refers to current object
        // Helps identify which object called this method
        System.out.println(this.color);
    }
}

// Another class
class Student {

    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterized constructor
    Student(String name, int age) {

        // Constructor gets called automatically
        // when object is created
        System.out.println("Constructor called first");

        this.name = name;
        this.age = age;
    }
}

// Class for copy constructor example
class Fruit {

    String color;
    int quantity;

    public void info() {
        System.out.println(this.color);
        System.out.println(this.quantity);
    }

    // Copy constructor
    Fruit(Fruit f2) {

        System.out.println("Copy constructor called");

        // Copy data from another object
        this.color = f2.color;
        this.quantity = f2.quantity;
    }

    // Non-parameterized constructor
    // Needed because Java will not create default constructor
    // once another constructor is created
    Fruit() {

    }
}

public class OOPSBasics {

    public static void main(String[] args) {

        // pen1 and pen2 are objects

        // new keyword:
        // Allocates memory in heap
        // Constructor gets called automatically

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        // Assign values using dot operator
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();

        System.out.println();

        // Parameterized constructor call
        Student s1 = new Student("Programmer", 25);

        s1.info();

        System.out.println();

        // Copy constructor example
        Fruit f1 = new Fruit();

        f1.color = "Red";
        f1.quantity = 10;

        // Copying object data
        Fruit f2 = new Fruit(f1);

        f2.info();
    }
}
