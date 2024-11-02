import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        ArrayList<String> str2 = new ArrayList<String>();
        int[] freq = new int[n];
        str2.add(str[0]);
        for(int i=1; i<n; i++){
            boolean rep = false;
            for(int j=0; j<str2.size(); j++){
                //System.out.println(str2.size());
                if(str[i].equalsIgnoreCase(str2.get(j))){
                    rep = true;
                    if(freq[j] == 0){
                        freq[j]+=2;
                    }
                    else{
                        freq[j]++;
                    }
                    break;
                } 
            }
            if(!rep){
                    str2.add(str[i]);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<str2.size(); i++){
            System.out.print(str2.get(i) + " ");
            if(freq[i] > max){
                max = freq[i];
            }
        }
        System.out.println();
        System.out.print(max + " ");
        for(int i=0; i<str2.size(); i++){
            if(freq[i] == max){
                System.out.print(str2.get(i) + " ");
            }
        }
        scan.close();
    }
}
