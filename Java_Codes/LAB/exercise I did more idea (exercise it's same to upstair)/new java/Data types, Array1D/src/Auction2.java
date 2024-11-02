import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int[] arr1 = new int[n];
        int k = scan.nextInt();
    
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                int price = scan.nextInt();
                if(arr1[j] < 3){
                    if(price > arr[j]){
                        arr[j] = price;
                        arr1[j] = 0;
                    }
                    else {
                        arr1[j]++;
                    }
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
