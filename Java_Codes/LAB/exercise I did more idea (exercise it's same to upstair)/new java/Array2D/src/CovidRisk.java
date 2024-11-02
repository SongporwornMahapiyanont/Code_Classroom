import java.util.Scanner;

public class CovidRisk {
    static void addRisk(int[][] arr, int x, int y,int h , int w){
        int x_start = x-1;
        int x_end = x+1;
        int y_start = y-1;
        int y_end = y+1;

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
                arr[i][j]++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            arr[x][y]++;
            addRisk(arr, x, y, h, w);
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        
        System.out.println(max);
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(arr[i][j] == max){
                    System.out.print(i+1 + " ");
                    j = w;
                }
            }
        }
    }
}
