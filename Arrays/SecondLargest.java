import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // handle edge case
        if(n <= 1){
            System.out.println("Second largest not possible");
            return;
        }

        int arr[] = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            // if new max found
            if(arr[i] > max){
                secondMax = max;   // shift old max
                max = arr[i];
            }

            // if second max (not equal to max)
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        // final result
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest = " + secondMax);
        }

        sc.close();
    }
}
