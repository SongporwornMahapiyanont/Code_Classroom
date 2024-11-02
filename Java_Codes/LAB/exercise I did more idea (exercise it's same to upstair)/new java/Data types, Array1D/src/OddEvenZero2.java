import java.util.Scanner;

public class OddEvenZero2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int odd = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                System.out.print(arr[i] + " ");
                odd = 0;
            }
            else if(arr[i] % 2 != 0 && arr[i] > odd){
                odd = arr[i];
                System.out.print(arr[i] + " ");
            }
            
            
        }
        System.out.println(" ");

        int even = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                System.out.print(arr[i] + " ");
                even = 0;
            }
            else if(arr[i] % 2 == 0 && arr[i] > even){
                even = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        scan.close();
    }
}
