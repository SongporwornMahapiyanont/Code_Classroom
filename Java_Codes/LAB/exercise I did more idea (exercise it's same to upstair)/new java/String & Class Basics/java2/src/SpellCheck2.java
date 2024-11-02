import java.util.ArrayList;
import java.util.Scanner;

public class SpellCheck2 {

    static int spellCount(String str, String str2){
        int match = 0;
        int l1 = str.length();
        int l2 = str2.length();
        int str_long;
        if(l1 <= l2){
            str_long = l1;
        }
        else{
            str_long = l2;
        }

        for(int i=0; i<str_long; i++){
            if(str.charAt(i) == str2.charAt(i)){
                match++;
            }
        }

        return match;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        scan.nextLine();
        int k = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<k; i++){
            ArrayList<Integer> num = new ArrayList<Integer>();
            String str2 = scan.nextLine();

            for(int j=0; j<n; j++){
                num.add(spellCount(str[j], str2));
            }
            //System.out.println(num);
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                if(num.get(j) > max){
                    max = num.get(j);
                }
            }
            
            //System.out.println(max);
            int count_rep = 0;
            ArrayList<Integer> rep = new ArrayList<Integer>();
            for(int j=0; j<n; j++){
                if(num.get(j) == max){
                    count_rep++;
                    rep.add(j);
                }
            }
            //System.out.println(rep);
            if(count_rep > 1){
                boolean equal = false;
                int[] target = new int[1];
                for(int j=0; j<rep.size(); j++){
                    if(str[rep.get(j)].length() == str2.length() && str[rep.get(j)].length() - max == 0){
                        equal = true;
                        target[0] = j;
                    }
                }
                if(equal){
                    System.out.println(str[rep.get(target[0])]);
                }
                else{
                    System.out.println(str[rep.get(0)]);
                }
                
            }
            else{
                System.out.println(str[rep.get(0)]);
            }
        }
        scan.close();
    }
}
