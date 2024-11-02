import java.util.Scanner;

public class Sum2D {

    static int Sum(int[][] arr, int h, int w, int x, int y){
        int count = 0;
        for(int i=0; i<h; i++){
            count+=arr[i][y];
        }
        for(int i=0; i<w; i++){
            count+=arr[x][i];
        }
        return count;
    }
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

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(Sum(arr, h, w, i, j)-arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
