import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int target  = sc.nextInt();
        boolean num = false;
        for(int i=0;i<N;i++)
        {
            if(array[i]==target)
            {
                System.out.print((i+1) + " ");
                num = true;
            }
        }
        if(num==false)
        {
            System.out.print("0");
        }
        
    }
}
