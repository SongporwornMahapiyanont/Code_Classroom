import java.util.Scanner;

public class NumTable2 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C =sc.nextInt();
        int [][]array = new int[R+1][C+1];
        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=C;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();
        int latest = -1;
        
        for(int n=0;n<N;n++)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            boolean valrow = (r>=1) && (c<=C);
            boolean valcol = (c>=1) && (r<=R);

            if(valcol && valrow)
            {
                if(array[r][c] != latest)
                {
                    System.out.print(array[r][c]);
                }
                else 
                {
                    System.out.print("*");
                }
                latest = array[r][c];
            }
            else
            {
                if(latest != -1)
                {
                    System.out.println();
                }
                latest = -1;
            }
        }
        System.out.println();
    }
}
