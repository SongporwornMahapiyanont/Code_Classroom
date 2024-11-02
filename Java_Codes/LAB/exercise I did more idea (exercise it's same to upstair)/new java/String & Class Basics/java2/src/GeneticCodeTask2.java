import java.util.ArrayList;
import java.util.Scanner;

public class GeneticCodeTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        
        ArrayList<Integer> arr_open = new ArrayList<Integer>();
        ArrayList<Integer> arr_close = new ArrayList<Integer>();
        int opne = 0;
        int close = 0;
        int count_opne = 0;
        int count_close = 0;
        for(;;){
            int target = str.indexOf('<', opne)+1;
            if(target == 0){
                break;
            }
            arr_open.add(target);
            count_opne++;
            opne = target;
        }

        for(;;){
            int target = str.indexOf('>', close)+1;
            if(target == 0){
                break;
            }
            arr_close.add(target);
            count_close++;
            close = target;
        }

        int n;
        if(count_close <= count_opne){
            n = count_close;
        }
        else{
            n = count_opne;
        }

        for(int i=0; i<n; i++){
            System.out.println(str.substring(arr_open.get(i), arr_close.get(i)-1));
        }
        scan.close();
    }
}
