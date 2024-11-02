import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int p = scan.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<p; i++){
            int x = scan.nextInt();
            if(arr[x-1] < k){
                arr[x-1]++;
                System.out.println(1);
            }
            else{
                arr2[x-1]++;
                System.out.println(2);
            }

        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        }
        scan.close();
    }
}
