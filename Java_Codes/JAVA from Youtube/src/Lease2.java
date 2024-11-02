import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int []input = new int[y+1];
        for(int i=1;i<=y;i++)
        {
            input[i] = sc.nextInt();
        }
        int year =sc.nextInt();
        for(int i=1;i<=y;i++)
        {
            input[i]=input[i]+(year-1);
        }
        
        int v = sc.nextInt();
        
        for(int i=1;i<=v;i++)
        {
            int num=0;
            int Year=sc.nextInt();
            for(int j=1;j<=y;j++)
            {
                if(input[j]>=Year)
                {
                    num+=1;
                    if(num==y)
                    {
                        System.out.print("full");
                        break;
                    }
                }
                else if(input[j]<Year)
                {
                    System.out.print(j +" ");
                }
            }
            System.out.println(" ");            
        }
    }
}
