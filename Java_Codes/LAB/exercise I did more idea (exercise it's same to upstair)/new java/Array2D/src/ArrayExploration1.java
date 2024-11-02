import java.util.Scanner;

public class ArrayExploration1 {
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

        int positive_num = 0;
        int negative_num = 0;
        int even = 0;
        int odd = 0;
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;

            if(!(r < 0 || r > h-1 || c < 0 || c > w-1)){
                int num = arr[r][c];
                if(arr[r][c] < 0){
                    negative_num++;
                    System.out.println(num);
                }
                else if(arr[r][c] > 0){
                    positive_num++;
                }

                if(arr[r][c] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println(positive_num + " " + negative_num + " " + even + " " + odd);
    }
}
