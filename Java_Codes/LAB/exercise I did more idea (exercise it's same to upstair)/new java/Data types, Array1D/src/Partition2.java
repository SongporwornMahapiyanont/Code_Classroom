import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int center = arr[n/2];
        int count = 0;
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] <= center){
                arr2[count] = arr[i];
                count++;
            }
        }

        int center2 = arr2[count/2];

        for(int i=0; i<count; i++){
            if(arr2[i] <= center2){
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println(" ");
        for(int i=0; i<count; i++){
            if(arr2[i] > center2){
                System.out.print(arr2[i] + " ");
            }
        }
        scan.close();
    }
}
