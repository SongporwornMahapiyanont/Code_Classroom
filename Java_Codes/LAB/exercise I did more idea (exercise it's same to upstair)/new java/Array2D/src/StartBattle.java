import java.util.Scanner;

public class StartBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        int[][] arr2 = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        int hit = 0;
        int miss = 0;
        int rep = 0;
        int miss_rep = 0;
        int out = 0;

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            if(r < 0 || c < 0 || r > h-1 || c > w-1){
                out++;
            }
            else if(arr[r][c] == 1 && arr2[r][c] == 0){
                hit++;
                arr2[r][c]++;
            }
            else if(arr[r][c] == 1){
                rep++;
                arr2[r][c]++;
            }
            else if(arr[r][c] == 0 && arr2[r][c] == 0){
                miss++;
                arr2[r][c]++;

            }
            else if(arr[r][c] == 0){
                miss_rep++;
                arr2[r][c]++;
            }
        }
        System.out.println(hit);
        System.out.println(miss);
        System.out.println(rep);
        System.out.println(miss_rep);

        System.out.println(out);
    }
}
