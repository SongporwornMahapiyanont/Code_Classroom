import java.util.Scanner;

public class Labor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int k = scan.nextInt();
            int m = scan.nextInt();

            int gap = k/2;
            int start = m-1-gap;
            int end = m+gap;
            boolean less = false;
            boolean more = false;
           
            if(start < 0){
                less = true;
                start = 0;
            }
            if(end > n){
                more = true;
                end = n;
            }
            if(less || more){
                System.out.print("no ");
            }

            int sum = 0;
            boolean labor = true;
            //System.out.println(start + " " + end);
            for(int j=start; j<end; j++){
                sum += arr[j];
                if(arr2[j] < 5){
                    labor = false;
                }
            }
            System.out.print(sum + " ");
            if(labor && less == false && more == false){
                System.out.print("labor");
            }
            System.out.println(" ");
            less = false;
            more = false;
        }
        scan.close();
    }
}
