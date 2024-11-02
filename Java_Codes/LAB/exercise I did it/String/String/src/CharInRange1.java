import java.util.Scanner;

public class CharInRange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String []str1 = new String[3]; 
        
        for(int i=0;i<3;i++)
        {
            str1[i] = sc.nextLine();
        }
        for(int i=0;i<3;i++)
        {
            char ch = sc.next().charAt(0);
            int valch = (int)ch;
            boolean check =false;
            for(int j=0;j<3;j++)
            {
                if(valch >= (int)str1[j].charAt(0) && valch <= (int)str1[j].charAt(2) || valch <= (int)str1[j].charAt(0) && valch >= (int)str1[j].charAt(2))
                {
                    check = true;
                    System.out.print(j+1 + " ");
                }
            }
            if(check == false)
            {
                System.out.println("0");
            }
            System.out.println(" ");
        }

    }
}
