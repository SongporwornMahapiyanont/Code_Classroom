import java.util.Scanner;

public class ArrayCompress1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int round = scan.nextInt();
        int[] num = new int[round];
        for(int i=0; i<round; i++){
            num[i] = scan.nextInt();
        }
        int choose = scan.nextInt();
        int print = 0;

        for(int i=0; i<round; i++){
            if(num[i]!=choose){
                print+=num[i];
            }
            else { 
                System.out.print(print + " ");
                print = 0;
                System.out.print(choose + " ");
            }

            if(i==round-1){
                System.out.print(print + " ");
            }
        }
        scan.close();
    }
}