import java.util.Scanner;

public class MapMarking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int w = scan.nextInt();
        
        int x = scan.nextInt() - 1;
        int y = scan.nextInt() - 1;
        int n = scan.nextInt();
        int[][] arr = new int[h+1][w+1];
        arr[x][y]++;
        
        int count = 0;
        for(int i=0; i<n; i++){
            int num = scan.nextInt();
            
            if(num == 1 && y-1 >= 0){
                y--; 
            }
            else if(num == 2 && y+1 < w){
                y++;
            }
            else if(num == 3 && x-1 >= 0){
                x--;
            }
            else if(num == 4 && x+1 < h){
                x++;
            }
            arr[x][y]++;
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(arr[i][j] != 0){
                    count++;
                }
            }
        }
        x++;
        y++;
        System.out.println(x + " " + y);
        System.out.println(count);
    }
}
