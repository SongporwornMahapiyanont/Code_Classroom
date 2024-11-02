import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int []input = new int[y];
        for(int i=0;i<y;i++)
        {
            input[i] = sc.nextInt();
        }
        int year =sc.nextInt();
        for(int i=0;i<y;i++)
        {
            input[i]=input[i]+(year-1);
            System.out.print(input[i] + " ");
        }
    }
}
