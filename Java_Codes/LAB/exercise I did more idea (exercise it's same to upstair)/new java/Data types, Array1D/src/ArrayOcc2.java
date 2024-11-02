import java.util.Scanner;

public class ArrayOcc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[k];
        int[] arr1 = new int[n+1];
        for(int i=0; i<k; i++){
            arr[i] = scan.nextInt();
            if(arr[i] > 0 && arr[i] <= n){
                arr1[arr[i]]++;
            }
        }

        int min = 100000;
        for(int i=1; i<n+1; i++){
            if(arr1[i] < min){
                min = arr1[i];
            }
        }

        boolean set = false;
        int repeat = 1;
        int long_num = 1;
        int max = 0;
        int[] arr2 = new int[n+1];
        for(int i=1; i<n+1; i++){
            if(arr1[i] == min && set == false){         
                arr2[i]+=repeat;
                repeat++;
                set = true;
                
            }
            else if(arr1[i] == min){
                arr2[i]+=repeat;
                repeat++;
                long_num++;
            }
            else{
                set = false;
                if(long_num > max ){
                    max = long_num;
                }
                repeat = 1;
                long_num = 1;
            }
            
        }
        System.out.println(max);
        for(int i=1; i<=n; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

        

        for(int i=1; i<=n; i++){
            if(arr2[i]==max){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
