import java.util.Scanner;

public class ShrinkAndExpand {

    String shrinkAndExpand(String s) {
        if(s.length() == 1){
            return Character.toString(s.charAt(0)) + "" + Character.toString(s.charAt(0));
        }
        if(s.length() == 0){
            return "";
        }
        if(s.charAt(0) == s.charAt(1)){
            char c = s.charAt(0);
            s = s.substring(2);
            return c + shrinkAndExpand(s);
        }
        else{
            String c = s.charAt(0) + "" + s.charAt(0);
            s = s.substring(1);
            return c + shrinkAndExpand(s);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}
