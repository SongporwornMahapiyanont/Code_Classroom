import java.util.Scanner;
import java.util.Arrays;
public class CharWatch1 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Read inputs as strings of one character
    String s1 = scan.next();
    String s2 = scan.next();
    String s3 = scan.next();

    // Extract the first char to obtain the characters we need.
    char char1 = s1.charAt(0);
    char char2 = s2.charAt(0);
    char char3 = s3.charAt(0);

    String major = scan.next();

    int N = scan.nextInt();
    int []freq = new int[3]; 
    
    int over = 0;

    for(int i=0;i<N;i++)
    {
        int val = scan.nextInt();
        if(val>=1 && val<=major.length())
        {
            if(char1 == major.charAt(val-1))
            {
                freq[0]+=1;
            }
            else if(char2 == major.charAt(val-1))
            {
                freq[1]+=1;
            }
            else if(char3 == major.charAt(val-1))
            {
                freq[2]+=1;
            }
        }
        else
        {
            over+=1;
        }
    }
    for(int i=0;i<3;i++)
    {
        System.out.println(freq[i]);
    }
    System.out.println(over);



    }
}
