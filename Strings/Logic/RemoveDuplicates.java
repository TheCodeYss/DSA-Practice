import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // array to store unique characters
        char result[] = new char[str.length()];
        int index = 0;

        for(int i = 0; i < str.length(); i++){

            char current = str.charAt(i);
            boolean alreadyExists = false;

            // check only filled part
            for(int j = 0; j < index; j++){
                if(result[j] == current){
                    alreadyExists = true;
                    break;
                }
            }

            // add if not duplicate
            if(!alreadyExists){
                result[index] = current;
                index++;
            }
        }

        // print result
        System.out.print("Result: ");
        for(int i = 0; i < index; i++){
            System.out.print(result[i]);
        }

        sc.close();
    }
}
