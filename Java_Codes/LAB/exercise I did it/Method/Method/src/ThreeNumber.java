import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
    public void index (int []A1,int B)
    {
        Arrays.sort(A1);
        if(B == -1)
        {
            System.out.println(A1[0]);
        }
        else if(B == 0)
        {
            System.out.println(A1[1]);
        }
        else if(B ==1)
        {
            System.out.println(A1[2]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeNumber ob = new ThreeNumber();
        int []A1 = new int[3];
        for(int i=0;i<3;i++)
        {
            A1[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        ob.index(A1,B);
    }
}
