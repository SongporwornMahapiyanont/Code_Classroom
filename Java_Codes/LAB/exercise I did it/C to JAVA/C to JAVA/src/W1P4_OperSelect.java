import java.util.Scanner;

public class W1P4_OperSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result;
        if(z==4 && y==0)
        {
            System.out.println("cannot divide by zero");
        }
        else if(z==5 && y==0)
        {
            System.out.println("cannot divide by zero");
        }
        else if(z==1)
        {
            result = x+y;
            System.out.println(result);
        }
        else if(z==2)
        {
            result = x-y;
            System.out.println(result);
        }
        else if(z==3)
        {
            result=x*y;
            System.out.println(result);
        }
        else if(z==4)
        {
            result = x/y;
            System.out.println(result);
        }
        else if(z==5)
        { 
            result = x%y;
            System.out.println(result);
        }
    }
}
