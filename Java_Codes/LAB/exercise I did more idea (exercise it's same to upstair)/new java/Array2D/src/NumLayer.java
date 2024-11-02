import java.util.Scanner;

public class NumLayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];

        int min = h/2;
        if(w/2 < min){
            min = w/2;
        }
        
        for(int layer = 0; layer<min; layer++){
            int x = 0+layer;
            int x_end = h-1-layer;
            int y = w-1-layer;
            int num = 0;
            for(int i=x; i<w-layer; i++){
                arr[x][i] = num;
                num = (num+1)%10;
            }
            for(int i=x+1; i<h-layer; i++){
                arr[i][y] = num;
                num = (num+1)%10;
            }
            for(int i=y-1; i>=x; i--){
                arr[x_end][i] = num;
                num = (num+1)%10;
            }
            for(int i=x_end-1; i>x; i--){
                arr[i][x] = num;
                num = (num +1)%10;
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