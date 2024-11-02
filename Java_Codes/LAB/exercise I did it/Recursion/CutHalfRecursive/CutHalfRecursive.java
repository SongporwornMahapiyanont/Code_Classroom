package CutHalfRecursive;

import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String s) {
        // System.out.println("str = " + s);
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() / 2) + cutHalf(s.substring(0, s.length() / 2))
                + cutHalf(s.substring((s.length() / 2) + 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
        scan.close();
    }
}
