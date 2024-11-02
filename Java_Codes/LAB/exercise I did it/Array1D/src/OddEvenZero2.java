import java.util.Scanner;
public class OddEvenZero2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        int max=-20000000;
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(array[i]>max && array[i]%2!=0)
            {
                max = array[i];
                System.out.print(max + " ");
            }
            else if(array[i]==0)
            {
                max=0;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" ");
        max=0;
        for(int i=0;i<N;i++)
        {
            if(array[i]>max && array[i]%2==0)
            {
                max = array[i];
                System.out.print(max + " ");
            }
            else if(array[i]==0)
            {
                max=0;
                System.out.print(array[i] + " ");
            }
        }
        
    }

}
