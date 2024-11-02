import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<=N;i++)
        {
            System.out.println("-------------" + i + "-------------");
            if(i>=N)
            {
                continue;
            }
            else
            {
                System.out.print(array[i] + " ");
                System.out.println(" ");

            }

        }

    }
}
