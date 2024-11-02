import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][1000];
        int[] count_k = new int[n];
        for(int i=0; i<n; i++){
            int k = scan.nextInt();
            count_k[i] = k;
            for(int j=0; j<k; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int wrong = 0;
        for(;;){
            int x = scan.nextInt() - 1;
            if(x+1 == 0){
                break;
            }
            int y = scan.nextInt();

            if(x < 0 || x > n-1 || y > count_k[x]-1 || y < 0){
                wrong++;
            }
            else{
                sum+=arr[x][y];
                if(arr[x][y] > max){
                    max = arr[x][y];
                }
                if(arr[x][y] < min){
                    min = arr[x][y];
                }
            }
        }

        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(wrong);
    }
}
