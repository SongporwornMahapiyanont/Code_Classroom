import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int [][]array = new int[R][C];
        
        int inside = 0;
        int outside = 0;
        
        for(int i=0;i<K;i++)
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row>0 && row<=R && col>0 && col<=C)
            {
                inside+=1;
            }
            else
            {
                outside+=1;
            }
        }
        System.out.println(inside);
        System.out.println(outside);
    }
}
