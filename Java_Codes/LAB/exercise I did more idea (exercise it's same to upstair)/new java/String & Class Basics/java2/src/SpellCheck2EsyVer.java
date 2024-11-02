import java.util.Scanner;

public class SpellCheck2EsyVer {
    static int spellCount(String str, String str2){
        int match = 0;
        for(int i=0; i<str2.length() && i<str.length(); i++){
            if(str.charAt(i) == str2.charAt(i)){
                match++;
            }
        }

        if(str2.length() == match && str.length() == match){
            match+=100000;
        }
        return match;
    }

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
            for(int j=0; j<n; j++)
            {
                if(spellCount(str[j], str2) > max){
                    max = spellCount(str[j], str2);
                    target = j;   
                }
            }
            System.out.println(str[target]);
        }
        scan.close();
    }
}