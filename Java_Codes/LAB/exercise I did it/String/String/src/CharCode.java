import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        char target = c.charAt(0);
        System.out.println(target);
        int valTarget = (int)target;
        System.out.println(valTarget);
    }
}
