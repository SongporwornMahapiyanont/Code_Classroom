import java.util.Scanner;

public class HowtoBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = -1;
        while(true){
            int num = scan.nextInt();
            count++;
            if(num == 0) break;
        }

        System.out.println(count);
        scan.close();
    }
}
