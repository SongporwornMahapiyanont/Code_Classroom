import java.util.Scanner;

public class FoundingTitan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt() + 6;
        int[][] arr = new int[n][n];
        int num = scan.nextInt();

        for(int i=0; i<3; i++){
            for(int j=i; j<n-i; j++){
                arr[i][j] = 3-i;
                arr[n-1-i][j] = 3-i;
                arr[j][i] = 3-i;
                arr[j][n-1-i] = 3-i;
            }
        }

        for(int i=0; i<num; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int titan = scan.nextInt();
            
            if(titan == 9 && arr[x][y] == 3){
                arr[x][y] = 9;
            }
            else if(titan == 9){
                System.out.println("Attack on Titan");
            }
            else if(titan == 8 && arr[x][y] == 2){
                arr[x][y] = 8;
            }
            else if(titan == 8){
                System.out.println("Attack on Titan"); 
            }
            else if(titan == 4 && arr[x][y] == 1){
                arr[x][y] = 4;
            }
            else if(titan == 4){
                System.out.println("Attack on Titan");
            }

        }
        int map = n*n;
        
        System.out.println("WALL MAP [" + map + "]");

        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("WALL MAP [" + map + "]");
    }
}
