import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // selection sort logic
        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // output
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
