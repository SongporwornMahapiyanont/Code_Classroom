import java.util.Scanner;

public class UnderLine1Method1 {
    
    public static void word (int N,Scanner sc)
    {
        for(int i=0;i<N;i++)
        {
            String str = sc.next();
            System.out.println(str);
            System.out.println("--------------------");
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        word(N,sc);
    }
}
