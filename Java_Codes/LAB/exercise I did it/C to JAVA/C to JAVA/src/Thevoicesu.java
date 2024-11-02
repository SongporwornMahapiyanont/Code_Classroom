import java.util.Scanner;

public class Thevoicesu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int commis1=1;
        int commis2=1;
        int sex,board1,board2;
        for(int i=1;i<=N;i++)
        {
            sex = sc.nextInt();
            board1 = sc.nextInt();
            board2 = sc.nextInt();
            if(sex == 1)
            {
                if(commis1<=K && board1>=9)
                {
                    System.out.println(i + " 1");
                    commis1+=1;
                }
                else if(commis2<=K && board2>=9)
                {
                    System.out.println(i + " 2");
                    commis2+=1;
                }
            }
            else if(sex == 2)
            {
                if(commis2<=K && board2>=9)
                {
                    System.out.println(i + " 2");
                    commis2+=1;
                }
                else if(commis1<=K && board1>=9)
                {
                    System.out.println(i + " 1");
                    commis1+=1;
                }
            }
        }
    }
}
