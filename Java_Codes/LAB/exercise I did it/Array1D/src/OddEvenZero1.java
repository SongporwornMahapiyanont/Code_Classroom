import java.util.Scanner;
public class OddEvenZero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(array[i]%2!=0 )
            {
                System.out.print(array[i] + " ");
            }
            else if(array[i]==0)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" ");

        for(int i=0;i<N;i++)
        {
            if(array[i]%2==0 )
            {
                System.out.print(array[i] + " ");
            }
            else if(array[i]==0)
            {
                System.out.print(array[i] + " ");
            }
        }
    }

}
