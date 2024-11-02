package BaseConverter;

import java.util.Scanner;

public class BaseConverter {

    String convertBase(int decimal, int base) {
        if (base == 2) {
            int result = decimal % 2;
            int value = decimal / 2;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 3) {
            int result = decimal % 3;
            int value = decimal / 3;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 4) {
            int result = decimal % 4;
            int value = decimal / 4;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 5) {
            int result = decimal % 5;
            int value = decimal / 5;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 6) {
            int result = decimal % 6;
            int value = decimal / 6;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 7) {
            int result = decimal % 7;
            int value = decimal / 7;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        } else if (base == 8) {
            int result = decimal % 8;
            int value = decimal / 8;
            if (decimal == 0) {
                return "";
            }
            return convertBase(value, base) + result + "";
        }
        int result = decimal % 9;
        int value = decimal / 9;
        if (decimal == 0) {
            return "";
        }
        return convertBase(value, base) + result + "";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = sc.nextInt();
        int base = sc.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
        sc.close();
    }
}
