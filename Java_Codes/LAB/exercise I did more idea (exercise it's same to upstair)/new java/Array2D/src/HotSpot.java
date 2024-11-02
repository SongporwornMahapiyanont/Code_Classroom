import java.util.Scanner;

public class HotSpot {
    static int FindCountHotSpot(int[][] arr, int h, int w, int target, int x, int y){
        int count = 0;

        for(int i=0; i<w; i++){
            if(arr[x][i] == target){
                count++;
            }
        }
        for(int i=0; i<h; i++){
            if(arr[i][y] == target){
                count++;
            }
        }
        return count;
    }
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

        int target = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int count_max = 1;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int count = FindCountHotSpot(arr, h, w, target, i, j);
                if(arr[i][j] == target){
                    count--;
                }
                if(count > max){
                    max = count;
                    count_max = 1;
                }
                else if(count == max){
                    count_max++;
                }
                // System.out.println((i+1) + " " + (j+1));
                // System.out.println("count is " + count);
            }
        }
        
        System.out.println(max);
        System.out.println(count_max);
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int count = FindCountHotSpot(arr, h, w, target, i, j);
                if(arr[i][j] == target){
                    count--;
                }
                if(count == max){
                    System.out.println(i+1 + " " + (j+1));
                }
            }
        }
    }
}
