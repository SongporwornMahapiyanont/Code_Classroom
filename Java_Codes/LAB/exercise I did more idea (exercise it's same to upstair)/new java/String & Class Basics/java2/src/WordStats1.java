import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        int[] num = new int[26];
        for(int i=0; i<n; i++){
            String str = scan.nextLine();
            num[(int) str.charAt(0) - 65]++;
        }
        for(int i=0; i<26; i++){
            if(num[i] > 0){
                int x = i+65;
                System.out.println((char) x + " " + num[i]);
            }
        }
        scan.close();
    }
}
