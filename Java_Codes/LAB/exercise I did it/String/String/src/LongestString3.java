import java.util.Scanner;

public class LongestString3{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String longest = "";
        int max = -99999999;
        int num=1;
        for(;;)
        {
            str = sc.nextLine();
            if(str.length() == 0)
            {
                break;
            }
            else if(str.length() > max)
            {
                num=0;
                max = str.length();
                longest = str;
                num+=1;
            }
            else if(str.length() == max)
            {
                num+=1;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
