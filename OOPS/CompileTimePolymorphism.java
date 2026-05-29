package OOPS;

/**
 * This program demonstrates
 * compile-time polymorphism
 * using method overloading.
 */

class Student {

    String name;
    int age;

    // Method with String parameter
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method with int parameter
    public void printInfo(int age) {
        System.out.println(age);
    }

    // Method with multiple parameters
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Programmer";
        s1.age = 20;

        s1.printInfo(s1.name);

        s1.printInfo(s1.age);

        s1.printInfo(s1.name, s1.age);
    }
}
