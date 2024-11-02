import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int target_h = scan.nextInt() - 1; 
        int target_w = scan.nextInt() - 1; 
        int r = scan.nextInt();
        int c = scan.nextInt();

        if(r+target_h > h+1 || c+target_w > w+1 || target_h < 0 || target_w < 0 || target_h > h || target_w > w){
            System.out.println("invalid input");
        }
        else{
            int[][] arr = new int[h][w];
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    arr[i+target_h][j+target_w] = 1;
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
}