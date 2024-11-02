import java.util.Scanner;

public class SecondLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        n = (n%100)/10;

        System.out.println(n);
        scan.close();
    }
}
