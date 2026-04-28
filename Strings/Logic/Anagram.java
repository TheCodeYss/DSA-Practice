import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input and preprocessing
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        // length check
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        // convert to char array and sort
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // compare arrays
        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
