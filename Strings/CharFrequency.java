import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        char visited[] = new char[str.length()];
        int index = 0;

        for(int i = 0; i < str.length(); i++){

            char current = str.charAt(i);

            // skip spaces
            if(current == ' ') continue;

            boolean alreadyVisited = false;

            // check if already counted
            for(int k = 0; k < index; k++){
                if(visited[k] == current){
                    alreadyVisited = true;
                    break;
                }
            }

            if(!alreadyVisited){

                int count = 0;

                // count frequency
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(j) == current){
                        count++;
                    }
                }

                System.out.println(current + " = " + count);

                visited[index] = current;
                index++;
            }
        }

        sc.close();
    }
}
