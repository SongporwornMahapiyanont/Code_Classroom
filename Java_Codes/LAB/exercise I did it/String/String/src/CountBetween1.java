import java.util.Arrays;
import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int countX = 0,countY = 0,countZ = 0;
        for(int i=0;i<N;i++)
        {
            if(array[i]>=x1 && array[i]<=x2)
            {
                countX+=1;
            }
            else if(array[i]>=y1 && array[i]<=y2)
            {
                countY+=1;
            }
            else
            {
                countZ+=1;
            }
        }
        System.out.println(countX);
        System.out.println(countY);
        System.out.println(countZ);
    }
}
