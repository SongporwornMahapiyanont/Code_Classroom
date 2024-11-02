import java.util.Scanner;

public class TableQuery1 {
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
        
        int order = scan.nextInt();
        int target = scan.nextInt() - 1;

        if(order == 1 && target < h){
            for(int i=0; i<w; i++){
                System.out.print(arr[target][i] + " ");
            }
        }
        else if(order == 2 && target < w){
            for(int i=0; i<h; i++){
                System.out.println(arr[i][target]);
            }
        }
        else {
            System.out.println("invalid Q");
        }
    }
}
