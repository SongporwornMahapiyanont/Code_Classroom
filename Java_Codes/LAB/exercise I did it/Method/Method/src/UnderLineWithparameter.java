import java.util.Scanner;

public class UnderLineWithparameter {
    static Scanner sc = new Scanner(System.in);
    public static void word (int N)
    {
        for(int i=0;i<N;i++)
        {
            String str = sc.next();
            int n = sc.nextInt();
            System.out.println(str);
            for(int j=0;j<n;j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        word(N);
    }
}
