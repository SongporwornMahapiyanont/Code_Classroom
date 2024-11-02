import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];
        
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            int R = scan.nextInt();
            int C = scan.nextInt();
            boolean not = false;
            if(!(r < 0 || c < 0 || r > h-1 || c > w-1 || r+R > h || c+C > w)){
                for(int y=0; y<R; y++){
                    for(int x=0; x<C; x++){
                        if(arr[y+r][x+c] != 0){
                            not = true;
                        }               
                    }
                }
                if(!not){
                    for(int y=0; y<R; y++){
                        for(int x=0; x<C; x++){
                            arr[y+r][x+c] = 1;                
                        }
                    }
                }
                
            }
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
