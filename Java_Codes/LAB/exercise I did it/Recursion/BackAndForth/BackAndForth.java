package BackAndForth;

import java.util.Scanner;

public class BackAndForth {
    String reorder(String s, boolean forward) {
        if (s.length() == 0) {
            return s;
        }
        if (forward) {
            boolean check = true;
            if (s.charAt(0) == 'A') {
                check = false;
            }
            return s.charAt(0) + reorder(s.substring(1), check);
        } else {
            boolean check = false;
            if (s.charAt(s.length() - 1) == 'A') {
                check = true;
            }
            return s.charAt(s.length() - 1) + reorder(s.substring(0, s.length() - 1), check);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
        scan.close();
    }
}
