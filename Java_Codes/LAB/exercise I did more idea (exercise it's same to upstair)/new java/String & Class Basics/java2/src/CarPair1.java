import java.util.ArrayList;
import java.util.Scanner;

public class CarPair1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Character> score = new ArrayList<Character>();
        for(int i=0; i<5; i++){
            int min1 = Integer.MAX_VALUE;  
            int min2 = Integer.MAX_VALUE;  

            String player1 = scan.next();
            String player2 = scan.nextLine();

            for(int j=0; j<player1.length(); j++){
                if((int) player1.charAt(j) < min1){
                    min1 = (int) player1.charAt(j);
                }
            }
            for(int j=1; j<player2.length(); j++){
                if((int) player2.charAt(j) < min2){
                    min2 = (int) player2.charAt(j);
                }
            }

            if(min1 > min2){
                score.add('L');
            }
            else if(min1 < min2){
                score.add('W');
            }
            else {
                score.add('D');
            }
            
        }   

        for(int i=0; i<5; i++){
            System.out.print(score.get(i));
        }

        scan.close();
    }
}
