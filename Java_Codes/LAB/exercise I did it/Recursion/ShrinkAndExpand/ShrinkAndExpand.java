package ShrinkAndExpand;

import java.util.Scanner;

public class ShrinkAndExpand {
    String shrinkAndExpand(String s) {
        if (s.length() <= 1) {
            return s + s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + shrinkAndExpand(s.substring(2));
        } else {
            return s.charAt(0) + "" + s.charAt(0) + shrinkAndExpand(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
        scan.close();
    }
}
