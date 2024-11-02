import java.util.Scanner;

public class CutHalfRecursive{
    public static String cutHalf(String s){
        if(s.length() == 0){
            return "";
        }
        int half = s.length() / 2;
        String s1 = s.substring(0, half);
        String s2 = s.substring(half+1);
        String a = Character.toString(s.charAt(half)) + cutHalf(s1) + cutHalf(s2);
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}