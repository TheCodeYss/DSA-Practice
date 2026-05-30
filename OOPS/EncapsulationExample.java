package OOPS;

/**
 * This program demonstrates
 * encapsulation in Java.
 *
 * Encapsulation:
 * Bundling data and methods into a class
 * and restricting direct access using private members.
 */

class Account {

    public String name;
    protected String email;

    // Hidden from outside the class
    private String password;

    // Setter method
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter method
    public String getPassword() {
        return password;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        Account account = new Account();

        account.name = "Programmer";
        account.email = "programmer@gmail.com";

        account.setPassword("abcd1234");

        System.out.println(account.name);
        System.out.println(account.email);

        // Access through getter
        System.out.println(account.getPassword());
    }
}
