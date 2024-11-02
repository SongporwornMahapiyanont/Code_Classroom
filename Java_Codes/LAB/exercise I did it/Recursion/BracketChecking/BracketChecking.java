package BracketChecking;

import java.util.Scanner;

public class BracketChecking {

    static boolean CheckBracket(String s) {
        String result = "";
        int indexOpen = s.indexOf("{");
        int indexOff = s.lastIndexOf("}");
        if (indexOpen == -1 && indexOff == -1) {
            return true;
        } else if (indexOff >= 0 && indexOpen >= 0) {
            if (indexOpen < indexOff) {
                String s1 = s.substring(0, indexOpen); // key
                String s2 = s.substring(indexOpen + 1, indexOff);
                String s3 = s.substring(indexOff + 1);
                result = s1 + s2 + s3;
                System.out.println("result = " + result);
            } else {
                String s1 = s.substring(0, indexOff); // key
                String s2 = s.substring(indexOff + 1, indexOpen);
                String s3 = s.substring(indexOpen + 1);
                result = s1 + s2 + s3;
                System.out.println("result = " + result);
            }
        } else {
            return false;
        }
        return CheckBracket(result) && true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(CheckBracket(str));
        scan.close();
    }
}
