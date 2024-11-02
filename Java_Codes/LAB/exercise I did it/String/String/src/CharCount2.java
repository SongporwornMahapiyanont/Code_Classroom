import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[100];
        int count=0;
        for(;;)
        {
            String sentens = sc.nextLine();
            count++;
            for(int i=0;i<sentens.length();i++)
            {
                char c = sentens.charAt(i);
                int valc = (int)c;
                array[valc]+=1;
                if(array[valc] == N)
                {
                    System.out.println(c);
                    System.out.println(count-1);
                    return;
                }
            }
        }
    }        
}
