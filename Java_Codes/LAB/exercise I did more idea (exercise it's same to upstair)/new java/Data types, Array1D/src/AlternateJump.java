import java.util.Scanner;

public class AlternateJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }

        int count1 = 0;
        int count2 = 0;
        int count_arr = 0;
        int count_arr2 = 0;
        boolean switch_arr = false;
        for(;;){
            if(!switch_arr){
                System.out.print("1 ");
                System.out.println(count1+1 + " " + arr[count1]);
                if(arr[count1] % 2 != 0){
                    switch_arr = true;
                    count2 += arr[count1]; //15        
                }
                else{
                    count1+=arr[count1]; //4
                    if(count1>n){
                        break;
                    }
                    
                }
                count_arr++;
            }
            else{
                System.out.print("2 ");
                System.out.println(count2+1 + " " + arr2[count2]);
                if(arr2[count2] % 2 != 0 ){
                    switch_arr = false;
                    count1 += arr2[count2]; //12
                }
                else{
                    count2+=arr2[count2]; //14
                    if(count2>n){
                        break;
                    }
                    
                }
                count_arr2++; 
            }

            // if(count1>n||count2>n){
            //     System.out.println("break");
            //     break;
            // }
        }
        System.out.println(count_arr);
        System.out.println(count_arr2);

    }
}
