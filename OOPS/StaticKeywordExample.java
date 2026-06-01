package OOPS;

/**
 * This program demonstrates
 * the static keyword in Java.
 *
 * Static variable belongs to the class
 * and is shared by all objects.
 */

class Student {

    static String school;

    String name;
}

public class StaticKeywordExample {

    public static void main(String[] args) {

        Student.school = "JMV";

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(s1.name + " - " + Student.school);

        System.out.println(s2.name + " - " + Student.school);
    }
}
