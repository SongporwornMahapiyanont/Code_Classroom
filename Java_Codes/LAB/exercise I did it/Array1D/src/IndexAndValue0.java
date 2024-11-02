import java.util.Scanner;

public class IndexAndValue0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        boolean check = false;
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            if(i == target)
            {
                System.out.println(array[i]);
                check = true;
            }
        }
        if(check == false)
        {
            System.out.println("-1");
        }
    }
}
