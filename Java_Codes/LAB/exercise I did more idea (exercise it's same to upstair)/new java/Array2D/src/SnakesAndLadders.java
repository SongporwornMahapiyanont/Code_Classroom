import java.util.Scanner;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int count = 0;
        System.out.println("Ladders");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > 1){
                    System.out.print(count+1 + " goto " + (count+1+arr[i][j]));
                    if(count+1+arr[i][j] >= n*n){
                        System.out.println(" error");
                    }
                    else{
                        System.out.println();
                    }
                }
                count++;
            }
        }

        count = 0;
        System.out.println("Snakes");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] < 1){
                    System.out.print(count+1 + " goto " + (count+1+arr[i][j]));
                    if(count+1+arr[i][j] <= 0 ){
                            System.out.println(" error");
                    }
                    else{
                        System.out.println();
                    }
                }      
                count++;
            }
        }
    }
}
