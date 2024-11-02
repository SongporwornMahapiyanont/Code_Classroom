import java.util.ArrayList;
import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        // String out = "";
        int count = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(;;){
            String str = scan.nextLine();
            if(str.length() == 0){
                break;
            }

            if(str.length() >= max){
                max = str.length();
                num.add(str.length());
                count++;
            }
        }

        System.out.println(max);

        int count2 = 0;
        for(int i=0; i<count; i++){
            if(num.get(i) == max ){
                count2++;
            }
        }
        System.out.println(count2);
        scan.close();
    }
    
}
