import java.util.Scanner;

public class SMSEncode {

    static void suEncode(String sentence, char ichar){
        if(sentence.length() > 1){
            int num1 = (int) sentence.charAt(0) - ichar;
            int num2 = (int) sentence.charAt(sentence.length()-1) - (int) sentence.charAt(0);
            System.out.println(num1 + " " + num2);
            ichar = sentence.charAt(0);
            sentence = sentence.substring(1, sentence.length()-1);
            suEncode(sentence, ichar);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.next();
        suEncode(sentence, '@');
    }
}
