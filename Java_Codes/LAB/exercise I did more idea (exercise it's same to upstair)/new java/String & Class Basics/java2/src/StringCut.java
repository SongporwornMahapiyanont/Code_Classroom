import java.util.ArrayList;
import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        int count = 0;
        ArrayList<Integer> target = new ArrayList<Integer>();
        
        for(int i=0; i<=str.length(); i++){
            int found = str.indexOf(str2, count);
            if(found == -1){
                break;
            }
            count=found+1;
            target.add(count);

        }
        
        int count2 = 0;
        boolean found_char = true; 
        if(target.size() == 0){
            found_char = false;
            System.out.println("no target character found");
        }

        if(target.size() == str.length()){
            System.out.println("no output");
        }

        for(int i=0; i<target.size(); i++){
            int start = count2;
            int end = target.get(i);
            if(start!=end-1){
                System.out.println(str.substring(start, end-1));
            }
            count2 = end;
        } 

        if(found_char && target.get(target.size()-1)!= str.length()){
            System.out.println(str.substring(target.get(target.size()-1), str.length()));
        }
        scan.close();
    }
}
