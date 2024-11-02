import java.util.Scanner;

public class Auction1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                int price = scan.nextInt();
                if(price > arr[j]){
                    arr[j] = price;
                }
            }

            for(int j=0; j<n; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
