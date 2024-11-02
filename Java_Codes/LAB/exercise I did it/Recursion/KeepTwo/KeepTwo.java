package KeepTwo;

import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str) {
        if (str.length() <= 0) {
            return str;
        }
        String s = Character.toString(str.charAt(0));
        int start = str.indexOf(s);
        int stop = str.lastIndexOf(s);
        // int STOP = str.indexOf(s, str.length());
        int middle = str.indexOf(s, start + 1);

        // System.out.println("start = " + start);
        // System.out.println("middle = " + middle);
        // System.out.println("stop = " + stop);
        // System.out.println("STOP = " + STOP);

        if (middle != stop && stop >= start && middle != -1) {
            str = str.substring(0, stop) + str.substring(stop + 1);
            // System.out.println("re = " + str);
            return keepTwo(str);
        } else {
            char word = str.charAt(0);
            str = str.substring(1);
            return word + keepTwo(str);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
        scan.close();
    }
}
