import java.util.Scanner;
import java.util.Arrays;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int []array = new int[N];
        int input,max=-20000000;
        int yes=0,no=0,repeat=0;

        for(int i=0;i<K;i++)
        {
            input = sc.nextInt();
            if(input>=1 && input<=N && array[input-1]==0)
            {
                array[input-1]+=1;
                yes+=1;
            }
            else if(input<1 || input>N)
            {
                no+=1;
            }
            else if(input>=1 && input<=N && array[input-1]!=0)
            {
                array[input-1]+=1;
                repeat+=1;
            }
        }
        System.out.println(yes);
        System.out.println(no);
        System.out.println(repeat);
        for(int i=0;i<N;i++)
        {
            if(array[i]>=max)
            {
                max = array[i];
            }
        }
        for(int i=0;i<N;i++)
        {
            if(array[i] == max)
            {
                System.out.print((i+1) + " ");
            }
        }
    }
}
