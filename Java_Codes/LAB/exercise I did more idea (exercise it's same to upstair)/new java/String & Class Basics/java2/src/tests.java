import java.util.Scanner;
import java.lang.Math;

public class tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        String word_target[] = new String[target];

        for(int i = 0 ; i < target ; i++){
            word_target[i] = sc.next();
        }

        int test = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < test ; i++){
            int max = Integer.MIN_VALUE;
            int correct = 0;
            String word_test = sc.nextLine();
            for(int j = 0 ; j < target  ; j++){
                int check = 0;   
                int minlength = Math.min(word_test.length(), word_target[j].length());
                for(int k = 0 ; k < minlength ; k++){
                    if(word_test.charAt(k) == word_target[j].charAt(k)){
                        check++;
                    }
                }

                if(check == word_target[j].length() && check == word_test.length()){
                    check+=100000;
                }
                if (check > max) {
                    max = check;
                    correct = j; 
                }
            }
            if(max != 0){
                System.out.println(word_target[correct]);
            }
            else{
                System.out.println(word_target[0]);
            }
        }
        sc.close();
    }
}