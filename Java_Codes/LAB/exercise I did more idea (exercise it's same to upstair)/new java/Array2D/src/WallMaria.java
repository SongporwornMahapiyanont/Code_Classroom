import java.util.Scanner;

public class WallMaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt() + 6;
        int[][] arr = new int[n][n];
        int map = n*n;
        System.out.println("WALL MAP [" + map + "]");

        for(int i=0; i<3; i++){
            for(int j=i; j<n-i; j++){
                arr[i][j] = 3-i;
                arr[n-1-i][j] = 3-i;
                arr[j][i] = 3-i;
                arr[j][n-1-i] = 3-i;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("WALL MAP [" + map + "]");
    }
}
