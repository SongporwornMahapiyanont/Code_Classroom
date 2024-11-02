import java.util.Arrays;
import java.util.Scanner;

public class UpSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N+1];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(array[i] >= array[i+1])
            {
                System.out.println(array[i]);
            }
        }
    }
}
