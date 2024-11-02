package PalindromeMaker;

import java.util.Scanner;

public class PalindromeMaker {
    String makePalindrome(String str) {

        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return makePalindrome(str.substring(1, str.length() - 1));
        } else {
            return str.charAt(0) + makePalindrome(str.substring(1, str.length() - 1)) + str.charAt(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(text);
        System.out.println(result);
        scan.close();
    }
}