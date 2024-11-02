import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc. nextLine();
        String input = sc.nextLine();
        int result = str.indexOf(input);
        if(result < 0 || result>str.length())
        {
            System.out.println("string not found");
        }
        else
        {
            System.out.println(result+1);
        }
    }
}
