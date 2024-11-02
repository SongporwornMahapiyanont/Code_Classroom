import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) throws Exception {
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
        int v = sc.nextInt();
        
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C-2;j++)
            {
                if(array[i][j] == v && array[i][j+1] == v && array[i][j+2] == v)
                {
                    System.out.print(i+1 + " ");
                    break;
                }
            }
        }
    }
}
