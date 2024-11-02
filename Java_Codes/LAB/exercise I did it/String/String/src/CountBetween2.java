import java.util.Scanner;


public class CountBetween2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  word = sc.next();
        int upper = 0,lower = 0,other = 0 ;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper+=1;
            }
            else if(Character.isLowerCase(ch))
            {
                lower+=1;
            }
            else
            {
                other+=1;
            }
        }
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(other);
    }
}
