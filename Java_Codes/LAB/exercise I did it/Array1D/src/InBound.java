import java.util.Scanner;

public class InBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        boolean check = false;
        for(int i=0;i<N;i++)
        {
            if(array[i]>=x1 && array[i]<=x2)
            {
                System.out.print(array[i] + " ");
                check = true;
            }
        }
        if(check == false)
        {
            System.out.println("no data");
        }
    }
}
