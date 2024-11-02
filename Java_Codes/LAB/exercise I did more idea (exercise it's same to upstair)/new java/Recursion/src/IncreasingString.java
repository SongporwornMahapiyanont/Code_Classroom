import java.util.Scanner;

public class IncreasingString {

    String makeIncreasingString(String str, char lastPrint) {
        if(str.length() == 0){
            return "";
        }
        if(str.charAt(0) == 'A'){
            str = str.substring(1);
            lastPrint = 'A';
            return "A" + makeIncreasingString(str, lastPrint);
        }
        else {
            if(str.charAt(0) > lastPrint){
                String s = Character.toString(str.charAt(0));
                lastPrint = str.charAt(0);
                str = str.substring(1);
                return s + makeIncreasingString(str, lastPrint);
            }
            else {
                str = str.substring(1);
                return makeIncreasingString(str, lastPrint);
            }
        }
    }

    public static void main(String[] args) {
        IncreasingString inc = new IncreasingString();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = inc.makeIncreasingString(str, 'A');
        System.out.print(result);
    }
}
