import java.util.Scanner;

public class ArrayCompress1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        int result=0;
        for(int j=0;j<n;j++)
        {
            
            if(array[j]!=k)
            {
                result+=array[j];
            }
            else if(array[j]==k)
            {
                System.out.print(result+" "+k+" ");
                result=0;
            }
        }
        System.out.print(result+" ");
        
    }
}
