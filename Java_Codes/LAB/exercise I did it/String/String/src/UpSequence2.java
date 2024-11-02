import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)<str.charAt(i+1))
            {
                System.out.print(str.charAt(i));
            }
            else if(str.charAt(i)>str.charAt(i+1))
            {
                System.out.println(str.charAt(i));
            }
            else if(str.charAt(i) == str.charAt(i+1))
            {
                System.out.println(str.charAt(i));
            }
        }
        if(str.charAt(str.length()-2) <= str.charAt(str.length()-1))
        {
            System.out.print(str.charAt(str.length()-1));
        }
        else
        {
            System.out.println(str.charAt(str.length()-1));
        }
        sc.close();
    }
}
