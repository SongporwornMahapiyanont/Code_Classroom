import java.util.ArrayList;
import java.util.Scanner;

public class Numtable1 {
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

        int k = scan.nextInt();
        //ArrayList<String> t
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            if(r < 0 || c < 0 || r > h-1 || c > w-1){
                System.out.print('-');
            }
            else{
                System.out.print(arr[r][c]);
            }
        }
    }
}
