import java.util.Scanner;
import java.util.Arrays;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int index = K-1;
        while(true) {
            System.out.printf("%d %d\n", index + 1, array[index]);
            index += array[index];
            if(index >= N) {
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
