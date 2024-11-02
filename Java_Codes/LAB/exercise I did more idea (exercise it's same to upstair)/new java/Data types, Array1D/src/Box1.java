import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int k = scan.nextInt();
        int[] box = new int[n];
        for(int i=0; i<k; i++){
            int do_ = scan.nextInt();
            int count = scan.nextInt();
            int box_num = scan.nextInt();

            if(do_ == 1){
                if(count <= arr[box_num-1]){
                    box[box_num-1] += count;
                    arr[box_num-1] -= count;
                    System.out.println(box[box_num-1]);
                }
                else {
                    System.out.println(-1);
                }
            }
            else{
                if(count <= box[box_num-1]){
                    box[box_num-1] -= count;
                    arr[box_num-1] += count;
                    System.out.println(box[box_num-1]);
                }
                else {
                    System.out.println(-1);
                }
            }

            // for(int j=0; j<n; j++){
            //     System.out.print(box[j] + " ");
            // }
            // System.out.println(" ");
        }
        scan.close();
    }
}
