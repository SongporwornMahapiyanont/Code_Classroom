import java.util.ArrayList;
import java.util.Scanner;

public class Numtable3 {
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
        int k = scan.nextInt();
        boolean out = false;
        boolean first = false;
        int count = 0;
        int row_max = 0;
        int row_min = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            if((r < 0 || c < 0 || r > h-1 || c > w-1) && !out && first){
                num.add(count);
                count = 0;
                out = true;
            }
            else if(r < 0 || c < 0 || r > h-1 || c > w-1){
            }
            else{
                first = true;
                out = false;
                count++;
            }
        }
        num.add(count);
        for(int i=0; i<num.size(); i++){
            if(max < num.get(i)){
                max = num.get(i);
            }
        }
        System.out.println(max);
        int count_max = 0;
        for(int i=0; i<num.size(); i++){
            if(max == num.get(i)){
                count_max++;
            }
        }
        System.out.println(count_max);
    }
}
