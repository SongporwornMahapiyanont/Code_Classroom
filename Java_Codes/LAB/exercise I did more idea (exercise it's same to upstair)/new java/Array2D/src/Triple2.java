import java.util.Scanner;
import java.util.ArrayList;

public class Triple2 {
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
            boolean found = false;
            for(int j=0; j<w-2; j++){
                if(arr[i][j] == k && arr[i][j+1] == k && arr[i][j+2] == k){
                    num.add(j+1);
                    found = true;
                }
            }
            if(!found){
                System.out.println(0);
            }
            else{
                System.out.println(num.get(0) + " " + num.get(num.size()-1));
                num.clear();
            }
        }
    }
}
