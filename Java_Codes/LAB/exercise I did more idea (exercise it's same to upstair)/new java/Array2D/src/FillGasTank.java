import java.util.Scanner;

public class FillGasTank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int p = scan.nextInt();
        for(int i=0; i<p; i++){
            char size = scan.next().charAt(0);
            int start = scan.nextInt() - 1;
            int end = scan.nextInt() - 1;

            int gallon;
            int time = arr[start][end];
            if(size == 'L'){
                gallon = 350;
            }
            else if(size == 'M'){
                gallon = 270;
            }
            else{
                gallon = 200;
            }

            float cost = (float)time/60*gallon;
            float ceil = cost - (int) cost;
            ceil*=10;
            if(ceil >= 9){
                cost++;
            }
            System.out.println(ceil);
            System.out.println((int) cost);
        }
    }
}
