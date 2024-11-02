import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int center = n/2;
        
        for(int i=0; i<n; i++){
            if(arr[i] <= arr[center]){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");
        for(int i=0; i<n; i++){
            if(arr[i] > arr[center]){
                System.out.print(arr[i] + " ");
            }
        }
        scan.close();
    }
}
