package IncreasingString;

import java.util.Scanner;

public class IncreasingString {
    String makeIncreasingString(String str, char lastPrint) {

        if (str.length() <= 0)
            return "";
        if (str.charAt(0) == 'A') {
            lastPrint = 'A';
            return "A" + makeIncreasingString(str.substring(1), lastPrint);
        } else {
            if (str.charAt(0) > lastPrint) {
                char c = str.charAt(0);
                lastPrint = c;
                return c + "" + makeIncreasingString(str.substring(1), lastPrint);

            } else {
                return makeIncreasingString(str.substring(1), lastPrint);
            }
        }
    }

    public static void main(String[] args) {
        IncreasingString inc = new IncreasingString();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = inc.makeIncreasingString(str, 'A');
        System.out.print(result);
        scan.close();
    }
}