import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        int target = sc.nextInt();
        String word3 = "";
        if(target == 1)
        {
            word3 = word1;
        }
        else
        {
            word3 = word2;
        }
        int N = 0;
        if(word1.length() < word2.length())
        {
            N = word1.length();
        }
        else if(word2.length() < word1.length())
        {
            N = word2.length();
        }
        for(int i=0;i<N;i++)
        {
            if(Character.isUpperCase(word1.charAt(i)) && Character.isLowerCase(word2.charAt(i)))
            {
                System.out.print(word1.charAt(i));
            }
            else if(Character.isUpperCase(word2.charAt(i)) && Character.isLowerCase(word1.charAt(i)))
            {
                System.out.print(word2.charAt(i));
            }
            else
            {
                System.out.print(word3.charAt(i));
            }
        }
    }
}
