import java.util.Scanner;

public class LongestString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String out = "";

        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            if(str.length() > max){
                max = str.length();
                out = str;
            }
        }

        System.out.println(out);
        scan.close();
    }
}
