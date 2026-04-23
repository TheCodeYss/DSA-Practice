import java.util.*;

public class CheckSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        // check sorted
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
    }
}
