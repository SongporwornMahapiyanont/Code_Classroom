import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        n %= 10;

        System.out.println(n);
        scan.close();
    }
}
