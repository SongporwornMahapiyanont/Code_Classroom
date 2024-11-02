import java.util.Scanner;

public class IndexAndValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num=0;
        int []array = new int[N];
        boolean check = false;
        boolean check2 = false;
        int best = 0;
        int best2 = 0;
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int index2 = sc.nextInt();

        for(int i=0;i<N;i++)
        {
            if(i == index)
            {
                check = true;
                best = i;
                num+=1;
            }
            if(i == index2)
            {
                check2 = true;
                best2 = i;
                num+=1;
            }
        }
        if(check == true)
        {
            System.out.println(array[best]);
            if(check2==true)
            {
                System.out.println(array[best2]);
            }
            else
            {
                System.out.println("-1");
            }
        }
        else
        {
            System.out.println("-1");
            if(check2==true)
            {
                System.out.println(array[best2]);
            }
            else
            {
                System.out.println("-1");
            }
        }
        System.out.println(num);

    }
}
