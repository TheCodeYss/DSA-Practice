import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // reverse string
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
