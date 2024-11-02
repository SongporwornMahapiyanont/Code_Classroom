import java.util.Scanner;

public class BattleMap {
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

        int k = scan.nextInt();
        System.out.println(k);

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
