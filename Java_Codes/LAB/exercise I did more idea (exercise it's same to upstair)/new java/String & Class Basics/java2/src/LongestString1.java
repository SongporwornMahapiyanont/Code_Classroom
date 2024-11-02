import java.util.Scanner;

public class LongestString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            int length = str.length();
            if(length>max){
                max = length;
            }
        }
        System.out.println(max);
        scan.close();
    }
}
