import java.util.Scanner;
public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String main = sc.nextLine();
        String input = sc.nextLine();

        for(int i=0;i<3;i++)
        {
            
            String j = input.substring(i, i+3);
            int num = main.indexOf(j);
            if(num<=0)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println(main.indexOf(j)+1);
            }
        }
    }
}
