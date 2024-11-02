import java.util.Scanner;
public class CookiePlan {
    static int planCookie(int[] flours,int[] butters) {
        int num=0;
        for(int i=0;i<flours.length;i++)
        {
            if(flours[i]<60 || butters[i]< 30)
            {
                System.out.println(i+1);
                num+=1;
            }
        }
        return num;
    }
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for(int i=0;i<N;i++)
        {
            flours[i] = scan.nextInt();
            butters[i] =scan.nextInt();
        }
        int EndDay = planCookie(flours,butters);

        System.out.println("There are " + EndDay + " days that ingredients are " +
                "insufficient");
        
    }
}