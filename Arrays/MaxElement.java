package Revision;
import java.util.*;

public class Max_Element_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input
        for(int i = 0; i < n; i++){
            System.out.println("Enter element " + i + ":");
            arr[i] = sc.nextInt();
        }

        // assume first element is max
        int max = arr[0];

        // check rest of array
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);

        sc.close();
    }
}
