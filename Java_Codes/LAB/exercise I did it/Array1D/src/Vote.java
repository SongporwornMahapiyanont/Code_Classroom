import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int max=0;
        int []array = new int[N+1];
        int num=0;
        for(int i=0;i<K;i++)
        {
            num = sc.nextInt();
            array[num]+=1;
        }
        int best=0;
        for(int i=1;i<=N;i++)
        {
            if(array[i]>=max)
            {
                max=array[i];
                best=i;
            }
        }
        System.out.println(best);
        System.out.println(array[best]);
        
    }
}
