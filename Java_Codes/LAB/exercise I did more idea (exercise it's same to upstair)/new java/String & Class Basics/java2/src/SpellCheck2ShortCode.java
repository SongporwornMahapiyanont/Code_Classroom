import java.util.Scanner;

public class SpellCheck2ShortCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        int k = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<k; i++){
            String str2 = scan.nextLine();
            int max = Integer.MIN_VALUE;  
            int target = 0;
            for(int j=0; j<n; j++){
                int match = 0;
                for(int ko=0; ko<str2.length() && ko<str[j].length(); ko++){
                    if(str[j].charAt(ko) == str2.charAt(ko)){
                        match++;
                    }
                }
                if(str2.length() == match && str[j].length() == match){
                    match+=100000;
                }
                if(match > max){
                    max = match;
                    target = j;   
                }
            }
            System.out.println(str[target]);
        }
        scan.close();
    }
}
