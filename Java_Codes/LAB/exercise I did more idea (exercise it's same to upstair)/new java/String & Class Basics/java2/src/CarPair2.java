import java.util.ArrayList;
import java.util.Scanner;

public class CarPair2 {
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
            
            boolean double1 = false;
            boolean double2 = false;
            if(player1.charAt(0) == player1.charAt(1)){
                double1 = true;
            }
            if(player2.charAt(1) == player2.charAt(2)){
                double2 = true;
            }

            if(double1 && double2 == false){
                score.add('W');
            }
            else if(double2 && double1 == false){
                score.add('L');
            }
            else if(min1 > min2){
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
