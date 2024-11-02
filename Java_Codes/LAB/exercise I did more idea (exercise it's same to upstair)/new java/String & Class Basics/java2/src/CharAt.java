import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int l = str.length();

        int num = scan.nextInt();
        if(num > l || num < 1){
            System.out.println("invalid position");
        }
        else {
            System.out.println(str.charAt(num-1));
        }
        scan.close();
    }
}
