package OOPS;

/**
 * This program demonstrates
 * abstraction using abstract classes.
 *
 * Abstraction:
 * Hides implementation details
 * and shows only essential functionality.
 */

abstract class Animal {

    Animal() {
        System.out.println("You are about to create an Animal.");
    }

    // Abstract method
    abstract void walk();

    // Non-abstract method
    public void breathe() {
        System.out.println("This animal breathes air");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractionUsingAbstractClass {

    public static void main(String[] args) {

        Horse horse = new Horse();

        horse.walk();

        horse.breathe();
    }
}
