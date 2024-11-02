import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] c = new char[str.length()];
        c = str.toCharArray();
        
        String str2 = scan.nextLine();
        char[] c1 = new char[str2.length()];
        c1 = str2.toCharArray();
        
        int[] freq = new int[5];
        int n = scan.nextInt();
        int wrong = 0;
        for(int i=0; i<n; i++){
            int num = scan.nextInt();
            if(num > 0 && num <= str2.length()){
                char target = c1[num-1];
                for(int j=0; j<5; j+=2){
                    if(c[j] == target){
                        freq[j]++;
                    }
                }
            }
            else {
                wrong++;
            }
        }

        for(int j=0; j<5; j+=2){
            System.out.println(freq[j]);
        }

        System.out.println(wrong);
        scan.close();
    }
}
