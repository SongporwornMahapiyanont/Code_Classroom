import java.util.Scanner;

public class UnderLine1Method2 {
    static Scanner sc = new Scanner(System.in);
    public static void word (int N)
    {
        for(int i=0;i<N;i++)
        {
            String str = sc.next();
            System.out.println(str);
            System.out.println("--------------------");
        }

    }
    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        word(N);
    }
}
