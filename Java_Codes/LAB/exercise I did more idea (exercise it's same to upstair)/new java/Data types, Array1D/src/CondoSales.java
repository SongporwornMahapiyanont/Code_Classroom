import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();
        int k = scan.nextInt();
        //int last_room = p+n;
        int count = 0;
        int[] condo = new int[n];
        for(int i=0; i<k; i++){
            int room = scan.nextInt();
            room-=p;
            
            if(room < n && room >= 0){
                condo[room]++;
                if(condo[room]==1){
                    count++;
                }
            }
        }

        System.out.println(count);
        for(int i=0; i<n; i++){
            if(condo[i]>0){
                System.out.println(i+p);
            }
        }
        scan.close();
    }
}
