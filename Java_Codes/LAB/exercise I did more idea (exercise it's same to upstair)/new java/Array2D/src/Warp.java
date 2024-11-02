import java.util.Scanner;

public class Warp {
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

        int x = scan.nextInt() - 1;
        int y = scan.nextInt() - 1;
        int hole = 0;
        boolean found_out = false;
        int x_start = 0;
        int y_start = 0;
        for(;;){
            for(int i=y; i<w; i++){
                if(arr[x][i] > 0){
                    hole = arr[x][i];
                    System.out.println(hole);
                    x_start = x+1;
                    y_start = i+1;
                    System.out.println(x_start + " " + y_start);
                    found_out = true;
                    break;
                }
            }
            x++;
            if(x == h-1 || found_out){
                break;
            }
        }

        found_out = false;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(arr[i][j] == hole && (i != x_start-1 || j != y_start-1)){
                    System.out.println((i+1) + " " + (j+1));
                    found_out = true;
                    j = w;
                }
            }
            if(found_out){
                break;
            }
        }
    }
}
