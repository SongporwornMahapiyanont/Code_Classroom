import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int round = scan.nextInt();

        int[] home = new int[round];
        for(int i=0; i<round; i++){
            home[i] = scan.nextInt();
            home[i]--;
        }

        int years = scan.nextInt();

        for(int i=0; i<round; i++){
            home[i]+=years;
            System.out.print(home[i] + " ");
        }
        scan.close();
    }
}
