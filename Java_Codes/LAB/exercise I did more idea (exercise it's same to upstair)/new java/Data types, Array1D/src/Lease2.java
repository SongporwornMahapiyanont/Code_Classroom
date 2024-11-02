import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int round = scan.nextInt();
        int[] home = new int[round];
        for(int i=0; i<round; i++){
            home[i] = scan.nextInt();
            home[i]--;
        }
        int year_start = scan.nextInt();
        for(int i=0; i<round; i++){
            home[i]+=year_start;
        }

        int test = scan.nextInt();
        for(int i=0; i<test; i++){
            boolean full = false;
            int year_test = scan.nextInt();
            for(int j=1 ; j<=round; j++){
                if(year_test>home[j-1]){
                    System.out.print(j + " ");
                    full = true;
                }
            }
            if(full==false){
                System.out.print("full");
            }
            System.out.print("\n");

        }
        scan.close();
    }
}
