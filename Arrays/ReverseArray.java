import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // handle edge case
        if(n <= 0){
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[n];

        // input array elements
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        //  Reverse logic:
        // swap first with last, second with second last...
        for(int i = 0; i < n / 2; i++){

            // opposite index
            int j = n - i - 1;

            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // print reversed array
        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
