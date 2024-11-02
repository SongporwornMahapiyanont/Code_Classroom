import java.util.Scanner;

public class Underline1 {

    static void underline(){
        System.out.println("--------------------");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String str = scan.next();
            System.out.println(str);
            underline();
        }
    }
}
