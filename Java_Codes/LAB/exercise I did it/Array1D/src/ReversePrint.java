import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int []input = new int[N];
       for(int i=0;i<N;i++)
       {
            input[i] = sc.nextInt();
       }
       for(int j=(N-1);j>=0;j--)
       {
            System.out.print(input[j] + " ");
       }
    }
}
