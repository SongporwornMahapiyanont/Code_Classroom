import java.util.Scanner;
public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array = new int[100];
        String sentens = sc.nextLine();
        for(int i=0;i<sentens.length();i++)
        {
            char c = sentens.charAt(i);
            int valC = (int)c;
            array[valC]+=1;
        }

        for(int i=0;i<100;i++)
        {
            if(array[i]>0)
            {
                char c = (char)i;
                System.out.print(c + " ");
                System.out.println(array[i]);
            }
        }
        
    }
}
