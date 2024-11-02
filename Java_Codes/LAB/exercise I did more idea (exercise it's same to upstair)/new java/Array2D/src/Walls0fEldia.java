import java.util.Scanner;

public class Walls0fEldia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt() + 6;
        int[][] arr = new int[n][n];

        int cops = 0;
        int deviant = 0;
        int attack_titan = 0; 
        int war_titan = 0;
        int armored_titan = 0;
        int colossus_titan = 0;
        for(;;){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int titan = scan.nextInt();

            if(x > n-1 || x < 0 || y > n-1 || y < 0 || titan > 9 || titan < 0){
                break;
            }
            arr[x][y] = titan;
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

        for(int i=3; i<n-3; i++){
            for(int j=3; j<n-3; j++){
                arr[i][j] = 100;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 9 || arr[i][j] == 8 || arr[i][j] == 6 || arr[i][j] == 4 || arr[i][j] == 1){
                    if(i == 0 || i == n-1 || j == 0 || j == n-1){
                        System.out.print("Wall Maria " );
                    }
                    else if(i == 1 || i == n-2 || j == 1 || j == n-2 ){
                        System.out.print("Wall Rose ");
                    }
                    else if(i == 2 || i == n-3 || j == 2 || j == n-3 ){
                        System.out.print("Wall Sina ");
                    }
                }
                if(arr[i][j] == 9){
                    colossus_titan++;
                    System.out.println(i + " " + j + " Colossus Titan");
                }
                else if(arr[i][j] == 8){
                    armored_titan++;
                    System.out.println(i + " " + j + " Armored Titan");
                }
                else if(arr[i][j] == 6){
                    war_titan++;
                    System.out.println(i + " " + j + " War Hammer Titan");
                }
                else if(arr[i][j] == 4){
                    attack_titan++;
                    System.out.println(i + " " + j + " Attack Titan");
                }
                else if(arr[i][j] == 1){
                    deviant++;
                    System.out.println(i + " " + j + " Deviant");
                }
                else if(arr[i][j] != 100 && arr[i][j] > 0){
                    cops++;
                }
            }
        }

        System.out.println("Survey Corps " + cops);
        System.out.println("Deviant " + deviant);
        System.out.println("Attack Titan " + attack_titan);
        System.out.println("War Hammer Titan " + war_titan);
        System.out.println("Armored Titan " + armored_titan);
        System.out.println("Colossus Titan " + colossus_titan);
    }
}
