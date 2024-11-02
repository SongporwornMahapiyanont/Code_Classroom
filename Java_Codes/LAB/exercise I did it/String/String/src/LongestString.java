import java.util.Scanner;

public class LongestString{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max = -20000000;
        for(int i=0;i<5;i++)
        {
            String str = sc.nextLine();
            if(str.length()>=max)
            {
                max = str.length();
            }
        }
        System.out.println(max);
        
        
    }
}
