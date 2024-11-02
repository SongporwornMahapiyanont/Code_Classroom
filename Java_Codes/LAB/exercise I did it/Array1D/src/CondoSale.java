import java.util.Scanner;
import java.util.Arrays;

public class CondoSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();
        int []array = new int[K];
        int input;
        for(int i=0;i<K;i++)
        {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array); //key
        int max = -20000000;
        int amount=0;
        for(int i=0;i<K;i++)
        {
            if(array[i]>=P && array[i]<=(N+P)-1)
            {
                if(array[i]>max)
                {
                    max = array[i];
                    amount+=1;
                }
            }
        }
        max=-20000000;
        System.out.println(amount);
        for(int i=0;i<K;i++)
        {
            if(array[i]>=P && array[i]<=(N+P)-1 && array[i]>max)
            {
                max = array[i];
                System.out.println(max + " ");
            }
        }
       
    }  
}
