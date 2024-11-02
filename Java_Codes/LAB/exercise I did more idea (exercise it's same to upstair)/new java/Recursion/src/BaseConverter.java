import java.util.Scanner;

public class BaseConverter{

    String convertBase(int decimal, int base){
        int a = decimal % base;
        decimal /= base;
        if(decimal == 0){
            return Integer.toString(a);
        }
        return convertBase(decimal, base) + a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = scan.nextInt();
        int base = scan.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
    }
}