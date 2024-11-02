import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        int N = str1.length();
        if(str1.length()>str2.length())
        {
            N = str2.length();
        }

        for(int i=0;i<N;i++)
        {
            if(str1.charAt(i) == '(' || str1.charAt(i) == ')' || str1.charAt(i) == '{' || str1.charAt(i) == '}')
            {
                System.out.print(str1.charAt(i));
            }
            else if(str2.charAt(i) == '(' || str2.charAt(i) == ')' || str2.charAt(i) == '{' || str2.charAt(i) == '}')
            {
                System.out.print(str2.charAt(i));
            }
            else if(Character.isDigit(str1.charAt(i)))
            {
                System.out.print(str1.charAt(i));
            }
            else if(Character.isDigit(str2.charAt(i)))
            {
                System.out.print(str2.charAt(i));
            }
            else if(Character.isUpperCase(str1.charAt(i)))
            {
                System.out.print(str1.charAt(i));
            }
            else if(Character.isUpperCase(str2.charAt(i)))
            {
                System.out.print(str2.charAt(i));
            }
            else
            {
                System.out.print(str1.charAt(i));
            }
        }
    }
}
