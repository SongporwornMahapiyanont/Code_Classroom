import java.util.Scanner;

public class TargetLand {
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
            int sum = 0;
            int start = k/2;
            boolean no = false;
            if(m-1-start < 0 || m-1+start > n-1){
                System.out.println("no");
                no = true;
            }
            else {
                
                for(int j=m-1-start; j<m+start; j++){
                    sum += arr[j];
                }
            }
            if(no == false){
                System.out.println(sum);
            }
        }
        scan.close();
    }
}
