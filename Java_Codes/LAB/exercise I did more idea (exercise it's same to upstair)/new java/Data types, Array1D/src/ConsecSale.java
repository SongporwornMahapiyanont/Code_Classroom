import java.util.Scanner;

public class ConsecSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();
        int k = scan.nextInt();

        boolean[] arr = new boolean[n];
        for(int i=0; i<k; i++){
            int room = scan.nextInt();
            room-=p;
            if(room < n && room >= 0){
                arr[room] = true;
            }
        }

        int count = 0;
        int room_not_rent = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == false){
                count++;
                room_not_rent++;
            }
            else {
                count = 0;
            }
            if(count > max){
                max = count;
            }

        }
        System.out.println(room_not_rent);
        System.out.println(max);
        
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        scan.close();
    }
}
