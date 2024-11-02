import java.util.Scanner;

public class ArrayExplaration2 {
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

        boolean positive_num_b = false;
        boolean negative_num_b = false;
        boolean even_b = false;
        boolean odd_b = false;
        int positive_num = 0;
        int negative_num = 0;
        int even = 0;
        int odd = 0;

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            boolean out_r = (r >= 0) && (r < h);
            boolean out_c = (c >= 0) && (c < w);

            if(!out_r || !out_c){
                if(negative_num_b){
                    negative_num++;
                }
                if(positive_num_b){
                    positive_num++;
                }
                if(odd_b){
                    odd++;
                }
                if(even_b){
                    even++;
                }
            }
            else{
                positive_num_b = false;
                negative_num_b = false;
                even_b = false;
                odd_b = false;
                if(arr[r][c] < 0){
                    negative_num++;
                    negative_num_b = true;
                }
                else if(arr[r][c] > 0){
                    positive_num++;
                    positive_num_b = true;
                }

                if(arr[r][c] % 2 == 0){
                    even++;
                    even_b = true;
                }
                else{
                    odd++;
                    odd_b = true;
                }
            }
        }
        System.out.println(positive_num + " " + negative_num + " " + even + " " + odd);
    }
}