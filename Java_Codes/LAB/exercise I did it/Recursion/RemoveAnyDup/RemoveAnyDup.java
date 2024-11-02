package RemoveAnyDup;

import java.util.Scanner;

public class RemoveAnyDup {
    String removeAnyDup(String str) {
        if (str.length() <= 0) {
            return str;
        }
        String c = str.charAt(0) + "";
        // System.out.println("c = " + c);
        String str1 = str.substring(1);
        // System.out.println("str1 = " + str1);
        if (str1.indexOf(c) != -1) {
            String result = c + str1.substring(0, str1.indexOf(c)) + str1.substring(str1.indexOf(c) + 1, str1.length());
            // System.out.println("result = " + result);
            return removeAnyDup(result);
        } else {
            return c + removeAnyDup(str1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
        scan.close();
    }
}
