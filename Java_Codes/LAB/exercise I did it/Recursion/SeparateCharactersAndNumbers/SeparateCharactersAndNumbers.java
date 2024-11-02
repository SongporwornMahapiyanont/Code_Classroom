package SeparateCharactersAndNumbers;

import java.util.Scanner;

public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        if (msg.length() == 0) {
            return "";
        }
        char c = msg.charAt(0);
        msg = msg.substring(1);
        if (!Character.isDigit(c)) {
            return c + split(msg);

        } else {
            return split(msg) + c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
        sc.close();
    }
}
