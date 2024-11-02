import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        if(N<=0 || N > str.length())
        {
            System.out.println("invalid position");
        }
        else
        {
            System.out.println(str.charAt(N-1));
        }
    }
}
