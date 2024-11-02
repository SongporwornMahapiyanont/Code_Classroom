import java.util.Scanner;

public class PalindromeMaker {

    String makePalindrome(String str) {
        if(str.length() == 1){
            return Character.toString(str.charAt(0));
        }
        if(str.length() == 0){
            return "";
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            str = str.substring(1, str.length()-1);
            return makePalindrome(str);
        }
        else {
            char c = str.charAt(0);
            str = str.substring(1, str.length()-1);
            return c + makePalindrome(str) + c;
        }  
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(text); 
        System.out.println(result);
    }
}
