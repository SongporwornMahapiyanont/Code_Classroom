import java.util.Scanner;

public class Inbound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int start = scan.nextInt();
        int end = scan.nextInt();

        boolean found_num = false;
        for(int i=0; i<n; i++){
            if(arr[i] >= start && arr[i] <= end){
                System.out.print(arr[i] + " ");
                found_num = true;
            }
        }
        if(found_num == false){
            System.out.println("no data");
        }
        scan.close();
    }
}
