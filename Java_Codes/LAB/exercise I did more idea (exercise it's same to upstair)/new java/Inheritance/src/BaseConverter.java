import java.util.Scanner;

public class BaseConverter{

    String convertBase(int decimal, int base){
        String result = "";
        for(;;){
            int r = decimal / base;
            int c = decimal % base;
            decimal = r;
            result += c;
            if(decimal == 0){
                break;
            }
        }
        String result2 = "";
        for(int i=result.length()-1; i>=0; i--){
            result2 += result.charAt(i);
        };
        return result2;
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