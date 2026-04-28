import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int n = str.length();
        boolean isPalindrome = true;

        // check from both ends
        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
