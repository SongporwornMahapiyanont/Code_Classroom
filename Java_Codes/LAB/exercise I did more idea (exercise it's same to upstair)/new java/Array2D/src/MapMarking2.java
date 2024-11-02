import java.util.Scanner;

public class MapMarking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] arr = new int[h][w];

        int x = scan.nextInt() - 1;
        int y = scan.nextInt() - 1;
        arr[x][y]++;

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            boolean xx = false;
            boolean XX = false;
            boolean yy = false;
            boolean YY = false;

            int num = scan.nextInt();
            if(num == 1){
                yy = true;
                y--; 
                if(y == -1){
                    y = w-1;
                }
            }
            else if(num == 2){
                YY = true;
                y++;
                if(y == w){
                    y = 0;
                }
            }
            else if(num == 3){
                xx = true;
                x--;
                if(x == -1){
                    x = h-1;
                }
            }
            else if(num == 4){
                XX = true;
                x++;
                if(x == h){
                    x = 0;
                }
            }
            int count_r = 0;
            for(;;){
                if(arr[x][y] == 0 || count_r == w-1){
                    arr[x][y]++;
                    break;
                }
                else{
                    count_r++;
                    if(xx){
                        x--;
                        if(x == -1){
                            x = h-1;
                        }
                    }
                    else if(XX){
                        x++;
                        if(x == h){
                            x = 0;
                        }
                    }
                    else if(yy){
                        y--;
                        if(y == -1){
                            y = w-1;
                        }
                    }
                    else if(YY){
                        y++;
                        if(y == w){
                            y = 0;
                        }
                    }
                }
            }  
            count_r = 0;   
        }

        int count = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                //System.out.print(arr[i][j] + " ");
                if(arr[i][j] != 0){
                    count++;
                }
            }
            //System.out.println();
        }
        x++;
        y++;
        System.out.println(x + " " + y);
        System.out.println(count);
    }
}
