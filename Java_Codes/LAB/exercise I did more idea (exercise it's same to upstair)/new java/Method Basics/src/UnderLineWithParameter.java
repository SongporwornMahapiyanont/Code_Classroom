import java.util.Scanner;

public class UnderLineWithParameter {
    static void underline(String name, int num){
        System.out.println(name);
        for(int i=0; i<num; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String str = scan.next();
            int number = scan.nextInt();
            underline(str, number);
        }
    }
}
