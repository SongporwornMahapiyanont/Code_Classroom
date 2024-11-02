import java.util.Scanner;

public class RowCapacity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        int[] arr2 = new int[h];

        int k = scan.nextInt();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            int point = scan.nextInt();
            if(arr2[x]+point <= k){
                arr[x][y]+=point;
                arr2[x]+=point;
            }
        }

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
