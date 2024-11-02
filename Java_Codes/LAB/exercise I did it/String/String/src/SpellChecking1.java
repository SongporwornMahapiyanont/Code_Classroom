import java.util.Arrays;
import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []target = new String[n];
        for(int i=0;i<n;i++)
        {
            target[i] = sc.next();
        }
        boolean check = false;
        boolean checkT = false;

        for(int i=0;i<10;i++)
        {
            String word = sc.next();
            for(int j=0;j<n;j++)
            {
                check = target[j].equals(word);
                if(check == true)
                {
                    checkT = check;
                }
            }
            if(checkT == true)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
            check = false;
            checkT = false;
        }   
    }
}
