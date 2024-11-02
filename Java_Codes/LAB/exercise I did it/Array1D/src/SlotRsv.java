import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int []array = new int[N+1];
        int []array2 = new int[N+1];
        int input;
        for(int i=1;i<=P;i++)
        {
            input = sc.nextInt();
            for(int j=1;j<=N;j++)
            {
                if(array[j] != K && j==input)
                {
                    System.out.println("1");
                    array[input]+=1;
                }
                else if(array[j] == K && j==input)
                {
                    System.out.println("2");
                    array2[input]+=1;
                }
            }
        }
        for(int i=1;i<=N;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for(int j=1;j<=N;j++)
        {
            System.out.print(array2[j] + " ");
        }
    }
}
