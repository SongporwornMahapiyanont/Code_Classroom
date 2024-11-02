import java.util.Scanner;

public class TheVoiceSu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int s1 = 0, s2 = 0; 

        for(int i=1; i<=n; i++){
            int gender = scan.nextInt();
            int score1 = scan.nextInt();
            int score2 = scan.nextInt();

            if(gender == 1){
                if(s1 < k && score1 > 8){
                    System.out.println(i + " 1");
                    s1++;
                }
                else if(s2 < k && score2 > 8){
                    System.out.println(i + " 2");
                    s2++;
                }
            }
            else {
                if(s2 < k && score2 > 8){
                    System.out.println(i + " 2");
                    s2++;
                }
                else if(s1 < k && score1 > 8 ){
                    System.out.println(i + " 1");
                    s1++;
                }
            }
            
            //System.out.println("s1: " + s1 + " s2: " + s2);

        }
        scan.close();
    }
}
