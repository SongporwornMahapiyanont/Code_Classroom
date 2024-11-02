import java.util.Scanner;

public class Triple2 {
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
        boolean check = false;
        int firstest = 2000000000;
        int lastest = -2000000000;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C-2;j++)
            {
                if(array[i][j] == v && array[i][j+1] == v && array[i][j+2] == v)
                {
                    check = true;
                    if(j<=firstest)
                    {
                        firstest = j;
                        // System.out.println("first = " + firstest);
                        
                    }
                    else if(j>=lastest)
                    {
                        lastest = j;
                        // System.out.println("lastest = " + lastest);
                    }
                }
            }
            if(lastest<=firstest)
            {
                lastest = firstest;
            }
            if(firstest != 2000000000 && lastest != -2000000000)
            {
                System.out.print((firstest+1) + " " + (lastest+1));
            }
            if(check == false)
            {
                System.out.print("0");
            }
            System.out.println(" ");
            check = false;
            firstest = 2000000000;
            lastest = -2000000000;
        }
    }
}
