import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String out = "";

        for(;;){
            String str = scan.nextLine();
            if(str.length() == 0){
                break;
            }

            if(str.length() >= max){
                max = str.length();
                out = str;
            }
        }

        System.out.println(out);
        scan.close();
    }
}
