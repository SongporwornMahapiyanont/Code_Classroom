import java.util.Scanner;

public class HowLongestNoFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int count = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
            }
            else {
                count = 0;
            }
            if(count > max){
                max = count; 
            }
        }

        System.out.println(max);
        for(int i=0; i<=n-max; i++){
            boolean longest = false;
            for(int j=0; j<max; j++){
                if(arr[i+j] == 1){
                    longest = true;
                }
                else {
                    longest = false;
                    break;
                }
            }
            if(longest){
                System.out.print(i+1 + " ");
            }
        }
        scan.close();
    }
}
