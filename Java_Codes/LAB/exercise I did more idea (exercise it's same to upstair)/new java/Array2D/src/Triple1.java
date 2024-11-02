import java.util.ArrayList;
import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int k = scan.nextInt();
        for(int i=0; i<h; i++){
            for(int j=0; j<w-2; j++){
                if(arr[i][j] == k && arr[i][j+1] == k && arr[i][j+2] == k){
                    num.add(i+1);
                    j = w;
                }
            }
        }

        for(int i=0; i<num.size(); i++){
            System.out.print(num.get(i) + " ");
        }
    }
}
