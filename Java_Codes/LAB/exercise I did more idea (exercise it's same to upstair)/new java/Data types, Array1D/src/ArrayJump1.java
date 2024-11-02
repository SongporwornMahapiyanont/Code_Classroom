import java.util.Scanner;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = scan.nextInt();
        }

        int jump = 0;
        int count = 1;
        for(int i=1; i<6; i++){
            if(count>n){
                System.out.println("out of bounds");
                break;
            }
            else {
                System.out.println(count + " " + arr[count]);
                jump = arr[count];
                count+=jump;
            }
        }
        scan.close();
    }
}
