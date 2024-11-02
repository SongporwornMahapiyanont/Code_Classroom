import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[k];  
        int[] arr1 = new int[k]; 
        int count = 0;
        int wrong_num = 0;
        int max=0;
        
        for(int i=0; i<k; i++){
            arr[i] = scan.nextInt();
            if(arr[i] > 0 && arr[i] <= n){
                arr1[arr[i]]++;
            }
            else {
                wrong_num++;
            }
        }
        

        for(int i=0 ;i<k ;i++){
            if(arr1[i]!=0){
                count++;
            }
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println(count);
        System.out.println(wrong_num);
        System.out.println(k-count-wrong_num);
        for(int i=0; i<k; i++){
            if(arr1[i]==max){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
