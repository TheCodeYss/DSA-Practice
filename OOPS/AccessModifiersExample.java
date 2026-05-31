package OOPS;

/**
 * This program demonstrates
 * access modifiers in Java.
 *
 * private   -> only inside same class
 * default   -> same package
 * protected -> same package + subclasses
 * public    -> everywhere
 */

class AccessDemo {

    private int privateValue = 10;

    int defaultValue = 20;

    protected int protectedValue = 30;

    public int publicValue = 40;

    public void printPrivateValue() {
        System.out.println(privateValue);
    }
}

public class AccessModifiersExample {

    public static void main(String[] args) {

        AccessDemo demo = new AccessDemo();

        demo.printPrivateValue();

        System.out.println(demo.defaultValue);
        System.out.println(demo.protectedValue);
        System.out.println(demo.publicValue);
    }
}
