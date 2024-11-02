import java.util.Scanner;

public class OnlyOne3 {
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

        if(x < 0){
            x = 0;
        }
        if(x > h-1){
            x = h-1;
        }
        if(y < 0){
            y = 0;
        }
        if(y > w-1){
            y = w-1;
        }
        
        int count = 0;
        for(int i=0; i<h; i++){
            if(arr[i][y] == 1){
                count++;
            }
        }
        for(int i=0; i<w; i++){
            if(arr[x][i] == 1){
                count++;
            }
        }
        if(arr[x][y] == 1){
            count--;
        }
        System.out.println(count);
    }
}
