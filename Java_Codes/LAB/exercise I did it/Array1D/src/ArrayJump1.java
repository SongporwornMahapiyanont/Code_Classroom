import java.util.Scanner;
import java.util.Arrays;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        int check=0;
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int index = 0;
        while(true) {
            System.out.printf("%d %d\n", index + 1, array[index]);
            check+=1;
            if(check==5)
            {
                break;
            }
            index += array[index];
            if(index >= N) {
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
