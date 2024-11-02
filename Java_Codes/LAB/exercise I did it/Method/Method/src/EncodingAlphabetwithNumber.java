import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    public void translate (Scanner sc ,String str)
    {
           for(int i=0;i<str.length();i++)
            {
                int val = sc.nextInt();
                int tran = (int)str.charAt(i) + val;
                if(tran > 90)
                {
                    tran = 65;
                    int A1= ((90-(int)str.charAt(i)));
                    int A2 = val-A1;
                    System.out.print((char)((tran+A2)-1));
                }
                else
                {
                    System.out.print((char)tran);
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        EncodingAlphabetwithNumber ob = new EncodingAlphabetwithNumber();
        String str = sc.nextLine();
        ob.translate(sc,str);
    }
}
