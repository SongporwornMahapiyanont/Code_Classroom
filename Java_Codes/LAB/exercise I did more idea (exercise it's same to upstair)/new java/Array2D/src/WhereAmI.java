import java.util.Scanner;

public class WhereAmI {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int target = scan.nextInt();
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(arr[i][j] == target){
                    System.out.print(target + " ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
