import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
        String s = "";
        if(str.length() <= 1){
            return str;
        }

        if(front){
            s = str.charAt(0) + "" + str.charAt(str.length()-1);
            front = false;
        }
        else {
            s = str.charAt(str.length()-1) + "" + str.charAt(0);
            front = true;
        }
        str = str.substring(1, str.length()-1);
        return s + goInside(str, front);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
