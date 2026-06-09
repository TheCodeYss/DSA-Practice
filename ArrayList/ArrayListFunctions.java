package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This program demonstrates
 * commonly used ArrayList operations.
 *
 * Operations:
 * 1. add()
 * 2. get()
 * 3. set()
 * 4. remove()
 * 5. size()
 * 6. iteration
 * 7. sorting
 */

public class ArrayListFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(2);
        list.add(4);

        System.out.println("Initial List: " + list);

        // Get element
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Add element at specific index
        list.add(0, 1);

        System.out.println("After insertion: " + list);

        // Replace element
        list.set(0, 0);

        System.out.println("After replacement: " + list);

        // Remove element
        list.remove(1);

        System.out.println("After removal: " + list);

        // Size of ArrayList
        System.out.println("Size: " + list.size());

        // Traversing ArrayList
        System.out.print("Elements: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Sorting ArrayList
        list.add(5);
        list.add(3);
        list.add(1);

        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
