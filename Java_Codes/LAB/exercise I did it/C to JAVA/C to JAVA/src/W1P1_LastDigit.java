import java.util.Scanner;

public class W1P1_LastDigit {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x = (x/10)%10;
        System.out.println(x);
    }
}
