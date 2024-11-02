import java.util.Scanner;

public class IndexAndValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
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
            }
            if(i == index2)
            {
                check2 = true;
                best2 = i;
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
                array[best2] = -1;
                System.out.println(array[best2]);
            }
            
            if(array[best] > array[best2])
            {
                System.out.println(array[best]);
            }
            else if(array[best2] > array[best])
            {
                System.out.println(array[best2]);
            }
        }
        else
        {
            array[best] = -1;
            System.out.println(array[best]);
            if(check2==true)
            {
                System.out.println(array[best2]);
            }
            else
            {
                array[best2] = -1;
                System.out.println(array[best2]);
            }

            if(array[best] > array[best2])
            {
                System.out.println(array[best]);
            }
            else if(array[best2] > array[best])
            {
                System.out.println(array[best2]);
            }
        }
    }
}
