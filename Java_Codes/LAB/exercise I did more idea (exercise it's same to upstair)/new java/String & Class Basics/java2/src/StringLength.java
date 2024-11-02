import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int lenght = str.length();
        System.out.println(lenght);
        scan.close();
    }
}
