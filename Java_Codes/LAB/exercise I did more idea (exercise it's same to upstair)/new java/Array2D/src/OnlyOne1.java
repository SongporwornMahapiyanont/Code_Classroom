import java.util.Scanner;

public class OnlyOne1 {
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

        int max = Integer.MIN_VALUE;
        int count_max = 1;
        int target = 0;
        for(int i=0; i<w; i++){
            int count = 0;
            for(int j=0; j<h; j++){
                if(arr[j][i] == 1){
                    count++;
                }
            }

            if(count > max){
                max = count;
                count_max = 1;
                target = i;
            }
            else if(count == max){
                count_max++;
                target = i;
            }
        }
        System.out.println(max);
        System.out.println(target+1);
        
    }
}
