import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String upper = "";
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                System.out.print(ch);
            }
        }
        System.out.println("");
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(ch);
            }
        }
        System.out.println("");
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch) == false && Character.isLowerCase(ch)==false)
            {
                System.out.print(ch);
            }
        }
    }
}
