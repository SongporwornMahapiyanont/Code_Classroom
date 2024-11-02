import java.util.Scanner;

public class ColumnSummary {
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
        int sum = 0;
        for(int i=0; i<w; i++){
            int count = 0;
            for(int j=0; j<h; j++){
                if(arr[j][i] == target){
                    count++;
                    sum++;
                }
            }
            if(count > 0) {
                System.out.print(count + " ");
            }
            else{
                System.out.print("* ");
            }
            
        }
        System.out.println("\n" + sum);
    }
}