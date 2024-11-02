import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = scan.nextInt();
        }

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();

        int count_x = 0;
        int count_y = 0;
        int[] freq = new int[n];
        for(int i=0; i<n; i++){
            if(num[i] >= x1 && num[i] <= x2){
                freq[i]++;
                count_x++;
                
            }
            if(num[i] >= y1 && num[i] <= y2){
                freq[i]++;
                count_y++;
            }
        }
        
        int out = 0;
        for(int i=0; i<n; i++){
            if(freq[i] == 0){
                out++;
            }
        }

        System.out.println(count_x);
        System.out.println(count_y);
        System.out.println(out);

        scan.close();
    }
}
