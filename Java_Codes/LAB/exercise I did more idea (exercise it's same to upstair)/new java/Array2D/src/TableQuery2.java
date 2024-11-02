import java.util.Scanner;

public class TableQuery2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int x_start = scan.nextInt() - 1;
        int x_end = scan.nextInt() - 1;
        int y_start = scan.nextInt() - 1;
        int y_end = scan.nextInt() - 1;

        if(x_start < 0){
            x_start = 0;
        }
        if(x_end > h-1){
            x_end = h-1;
        }
        if(y_start < 0){
            y_start = 0;
        }
        if(y_end > w-1){
            y_end = w-1;
        }
        
        for(int i=x_start; i<=x_end; i++){
            for(int j=y_start; j<=y_end; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}