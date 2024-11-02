import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        int[][] arr2 = new int[h][w];
        int boat =0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = scan.nextInt();
                if(arr[i][j] == 1){
                    boat++;
                }
            }
        }
        
        int hit = 0;
        int miss = 0;
        int rep = 0;
        int miss_rep = 0;
        int out = 0;
        int first = 0;
        int last = 0;
        boolean win = false;
        boolean lose = false;

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
                if(!lose){
                    first = i+1;
                    lose = true;
                }
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

            if(hit == boat && !win){
                last = i+1;
                win = true;
            }
        }
        System.out.println(hit);
        System.out.println(miss);
        System.out.println(rep);
        System.out.println(miss_rep);
        System.out.println(out);

        if(hit == boat){
            System.out.print("attacker ");
            System.out.println(last);
        }
        else{
            System.out.print("battleship ");
            if(hit == 0){
                System.out.println(-1);
            }
            else{
                System.out.println(first);
            }
        }
    }
}