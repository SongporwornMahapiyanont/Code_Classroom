import java.util.ArrayList;
import java.util.Scanner;

public class CharInRange1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0; i<3; i++) {
            char c1 = scan.next().charAt(0);
            char c2 = scan.next().charAt(0);

            if(c2 < c1){
                char x = c1;
                c1 = c2;
                c2 = x;
            }
            num.add((int) c1);
            num.add((int) c2);
        }

        String[] target = new String[4];
        scan.nextLine();
        int a = 0;
        int b = 1;

        for(int i=0; i<3; i++){
            target[i] = scan.nextLine();
            boolean no = true;
            for(int j=0; j<3; j++){
                if(((int) target[i].charAt(0) >= num.get(a) && (int) target[i].charAt(0) <= num.get(b))){
                    System.out.print(j+1 + " ");
                    no = false;
                    // System.out.println(num.get(a));
                    // System.out.println(num.get(b));
                    
                }
                a+=2;
                b+=2;
            }
            if(no){
                System.out.print(0);
            }
            a=0;
            b=1;
            System.out.println();
            scan.close();
        }
    }
}
