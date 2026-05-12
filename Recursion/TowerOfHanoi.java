/**
 * This program solves the Tower of Hanoi problem
 * using recursion.
 */

public class TowerOfHanoi {

    // Recursive method
    public static void towerOfHanoi(int n, String source, String helper, String destination) {

        // Base condition
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Move current disk to destination
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        int n = 3;

        towerOfHanoi(n, "S", "H", "D");
    }
}
