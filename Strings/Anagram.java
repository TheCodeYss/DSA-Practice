import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        // remove spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // length check
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        // convert to char array
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // sort arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // compare arrays
        boolean isAnagram = true;

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
