import java.util.Scanner;

public class ConsecDupRemoval {

    String dupRemove(String str){
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        if(str.length() == 2){
            if(c1 != c2){
                String s = c1 + "" + c2;
                return s;
            }
            else {
                return Character.toString(c2);
            }
        }
        str = str.substring(1);
        if(c1 == c2){
            return dupRemove(str);
        }
        else {
            return c1 + dupRemove(str);
        }
    } 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
