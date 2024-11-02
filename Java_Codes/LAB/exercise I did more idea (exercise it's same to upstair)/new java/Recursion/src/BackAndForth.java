import java.util.Scanner;

public class BackAndForth {

    String reorder(String s, boolean forward){
        if(s.length() == 1){
            return Character.toString(s.charAt(0));
        }
        if(forward){
            char c1 = s.charAt(0);
            if(c1 == 'A'){
                forward = false;
            }
            s = s.substring(1, s.length());
            return c1 + reorder(s, forward);
        }
        else {
            char c2 = s.charAt(s.length() - 1);
            if(c2 == 'A'){
                forward = true;
            }
            s = s.substring(0, s.length() - 1);
            return c2 + reorder(s, forward);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
    }
}
