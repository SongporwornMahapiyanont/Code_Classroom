import java.util.Scanner;

public class HowLongNoFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<3; i++){
            int num_start = scan.nextInt();
            int count = 0;
            for(;;){
                if(arr[num_start-1] == 1){
                    num_start++;
                    count++;
                    if(num_start == n){
                        System.out.println(count+1);
                        break;
                    }
                    
                }
                else{
                    System.out.println(count);
                    count=0;
                    break;
                }
            }
        }
        scan.close();
    }
}
