import java.util.Scanner;

public class TargetPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int k = scan.nextInt();
            int m = scan.nextInt();

            int gap = k/2;
            int start = m-1-gap;
            int end = m+gap;
            int sum = 0;
            boolean less = false;
            boolean more = false;
            
            if(m-1-gap < 0){
                less = true;
                start = 0;
            }
            if(m-1+gap >= n){
                more = true;
                end = n;
            }  
            if(more || less){
                System.out.print("no ");
            }
            for(int j=start; j<end; j++){
                sum += arr[j];
            }
            System.out.println(sum);
            less = false;
            more = false;
        }
        scan.close();
    }
}
