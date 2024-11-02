import java.util.Scanner;

public class NumTable1 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int [][]array = new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row>0 && row<=R && col>0 && col<=C)
            {
                System.out.print(array[row-1][col-1]);
            }
            else
            {
                System.out.print("-");
            }
        }
    }
}
