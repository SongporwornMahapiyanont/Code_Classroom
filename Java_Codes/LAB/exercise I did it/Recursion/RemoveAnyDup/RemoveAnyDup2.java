package RemoveAnyDup;

import java.util.Scanner;

public class RemoveAnyDup2 {
    String removeAnyDup(String str) {
        if (str.length() <= 0) {
            return str;
        }
        String c = str.charAt(0) + "";
        // System.out.println("c = " + c);
        String str1 = str.substring(1);
        // System.out.println("str1 = " + str1);
        str1 = str1.replaceAll(c, ""); // new method for replace (char repeat)
        return c + removeAnyDup(str1);
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
