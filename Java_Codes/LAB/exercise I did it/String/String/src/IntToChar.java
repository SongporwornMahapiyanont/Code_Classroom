import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val>=65 && val<=90) 
            System.out.println((char)val);
        else
            System.out.println("unsupported code");
    }
}
