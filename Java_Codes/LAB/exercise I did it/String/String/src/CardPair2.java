import java.util.Scanner;

public class CardPair2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int j=0;j<5;j++)
        {

            String str1 = sc.next();
            String str2 = sc.next();
            int best1 = 20000000;
            int best2 = 20000000;
            boolean check = false;
            boolean check2 = false;
            
            for(int i=0;i<2;i++)
            {
                char ch = str1.charAt(i);
                int valCh = (int)ch;
                if(valCh==best1)
                {
                    check = true;
                }
                if(valCh<=best1)
                {
                    best1 = valCh;
                }
            }
            for(int i=0;i<2;i++)
            {
                char ch2 = str2.charAt(i);
                int valCh2 = (int)ch2;
                if(valCh2 == best2)
                {
                    check2 = true;
                }
                if(valCh2<=best2)
                {
                    best2 = valCh2;
                }
            }
            if(check== true && check2==false)
            {
                System.out.print("W");
            }
            else if(check== false && check2==true)
            {
                System.out.print("L");
            }
            else 
            {
                if(best1<best2)
                {
                    System.out.print("W");
                }
                else if(best1>best2)
                {
                    System.out.print("L");
                }
                else
                {
                    System.out.print("D");
                }
            }

        }
    }
}
