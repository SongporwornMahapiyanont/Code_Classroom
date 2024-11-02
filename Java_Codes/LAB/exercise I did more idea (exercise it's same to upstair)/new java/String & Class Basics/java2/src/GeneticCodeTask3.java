import java.util.ArrayList;
import java.util.Scanner;

public class GeneticCodeTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        ArrayList<Integer> arr_open = new ArrayList<Integer>();
        ArrayList<Integer> arr_close = new ArrayList<Integer>();
        int open = 0;
        int close = 0;
        int count_open = 0;
        int count_close = 0;
        for(;;){
            int target = str.indexOf('<' , open)+1;
            if(target == 0){
                break;
            }

            arr_open.add(target);
            open = target;
            count_open++;
        }
        for(;;){
            int target = str.indexOf('>' , close)+1;
            if(target == 0){
                break;
            }

            arr_close.add(target);
            close = target;
            count_close++;
        }

        int n;
        if(count_close <= count_open){
            n = count_close;
        }
        else{
            n = count_open;
        }

        System.out.print(str.substring(0, arr_open.get(0)-1));
        for(int i=0; i<n; i++){
            String str2 = str.substring(arr_open.get(i), arr_close.get(i)-1);
            if(str2.indexOf("UAA") != -1){
                System.out.print("ochre");
            }
            else if(str2.indexOf("UGA") != -1){
                System.out.print("opal");
            }
            else if(str2.indexOf("UAG") != -1){
                System.out.print("amber");
            }
            else {
                System.out.print("unknown");
            }
            if(i < n-1){
                System.out.print(str.substring(arr_close.get(i), arr_open.get(i+1)-1));
            }
            
        }
        System.out.print(str.substring(arr_close.get(n-1), str.length()));
        scan.close();
    }
}
