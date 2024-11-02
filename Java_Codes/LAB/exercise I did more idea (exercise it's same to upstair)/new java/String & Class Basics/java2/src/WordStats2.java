import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        int[] num = new int[26];
        int[] most = new int[26];
        int[] less = new int[26];
        for(int i=0; i<n; i++){
            String str = scan.nextLine();
            int target = (int) str.charAt(0) - 65;
            num[target]++;
            if(most[target] == 0){
                most[target] = str.length();
            }
            else{
                //MAX
                if(most[target] < str.length()){
                    most[target] = str.length();
                }
            }

            if(less[target] == 0){
                less[target] = str.length();
            }
            else{
                //MIN
                if(less[target] > str.length()){
                    less[target] = str.length();
                }
            }
        }

        
        for(int i=0; i<26; i++){
            if(num[i] > 0){
                int x = i+65;
                System.out.println((char) x + " " + less[i] + " " + most[i]);
            }
        }
        scan.close();
    }
}
