import java.util.Scanner;

public class ThreeNumber {
    static int number(int[] num, int order){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_num = 0;
        int max_num = 0;
        int median = 0;
        for(int i=0; i<3; i++){
            if(num[i] > max){
                max = num[i];
                max_num = i+1;
            }
            if(num[i] < min){
                min = num[i];
                min_num = i+1;
            }
        }
        int target = min_num+max_num;
        if(target == 3){
            median = num[2];
        }
        else if(target == 4){
            median = num[1];
        }
        else{
            median = num[0];
        }
        
        if(order == -1){
            return min;
        }
        else if(order == 1){
            return max;
        }
        else{
            return median;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = new int[3];
        for(int i=0; i<3; i++){
            n[i] = scan.nextInt();
        }
        int Order = scan.nextInt();

        System.out.println(number(n, Order));
    }
}
