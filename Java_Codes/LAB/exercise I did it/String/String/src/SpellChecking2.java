import java.util.Arrays;
import java.util.Scanner;

public class SpellChecking2 {
    static String autoSpell(String[] str,String str2)
    {
        int []match = new int[str.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length() && j<str2.length();j++)
            {
                if(str[i].charAt(j) == str2.charAt(j))
                {
                    match[i]+=1;
                }
            }
            if(match[i] > max)
            {
                max = match[i];
            }
        }

        String word = " ";
        for(int i=0;i<str.length;i++)
        {
            if(match[i] == max)
            {
                word = str[i];
                break;
            }
        }
        return word;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String []str = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i] = sc.next();
        }

        int k = sc.nextInt();
        for(int i=0;i<k;i++)
        {
            boolean check = false;
            String str2 = sc.next();
            for(int j=0;j<n;j++)
            {
                if(str[j].equals(str2))
                {
                    check = true;
                }
            }
            if(check == true)
            {
                System.out.println(str2);
            }
            else
            {
                System.out.println(autoSpell(str,str2));
            }
        }
    }
}
