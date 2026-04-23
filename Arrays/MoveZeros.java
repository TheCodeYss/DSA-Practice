import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int j = 0; // position to place non-zero

        for(int i = 0; i < n; i++){

            if(arr[i] != 0){

                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        // print result
        System.out.print("Result: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
