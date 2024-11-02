import java.util.ArrayList;
import java.util.Scanner;

public class CharInRange2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0; i<3; i++){
            char c1 = scan.next().charAt(0);
            char c2 = scan.next().charAt(0);

            if((int) c1 > (int) c2){
                char x = c1;
                c1 = c2;
                c2 = x;
            }

            num.add((int) c1);
            num.add((int) c2);
        }

        scan.nextLine();
        String str = scan.nextLine();

        int correct = 0;
        int incorrect = 0;
        int score = 0;

        int a = 0;
        int b = 1;
        for(int i=0; i<str.length(); i++){
            int target = (int) str.charAt(i);
            boolean wrong = false;
            for(int j=0; j<3; j++){
                if(target >= num.get(a) && target <= num.get(b)){
                    wrong = true;
                    score++;
                }
                a+=2;
                b+=2;
            }
            if(!wrong){
                incorrect++;
            }
            else{
                correct++;
            }
            a=0;
            b=1;
        }
        System.out.println(correct);
        System.out.println(incorrect);

        score -= (incorrect*2);
        System.out.println(score);
        scan.close();
    }
}
