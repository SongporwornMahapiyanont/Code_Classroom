import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        ArrayList<String> str2 = new ArrayList<String>();
        str2.add(str[0]);
        
        for(int i=1; i<n; i++){
            boolean rep = false;
            for(int j=0; j<str2.size(); j++){
                if(str[i].equalsIgnoreCase(str2.get(j))){
                    rep = true;
                    break;
                }
            }
            if(!rep){
                str2.add(str[i]);
            }
        }

        for(int i=0; i<str2.size(); i++){
            System.out.print(str2.get(i) + " ");
        }

        scan.close();
    }
}
