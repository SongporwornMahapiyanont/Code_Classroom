package RecursiveAdd;

import java.util.Scanner;

public class RecursiveAdd {

    static String add(String x, String y, int order, int inc) {
        if (order == x.length()) {
            if (inc > 0) {
                return Integer.toString(inc);
            }
            return "";
        }
        char n = x.charAt(x.length() - 1 - order);
        char m = y.charAt(x.length() - 1 - order);
        int sum = Character.getNumericValue(n) + Character.getNumericValue(m) + inc;
        inc = 0;
        if (sum < 10) {
            return add(x, y, order + 1, inc) + sum;
        } else {
            inc = sum / 10;
            return add(x, y, order + 1, inc) + (sum % 10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        String y = scan.next();
        System.out.println(add(x, y, 0, 0));
        scan.close();
    }
}
