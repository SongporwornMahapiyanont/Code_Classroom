import java.util.Scanner;

class ZooTicketA{
    boolean age;
    boolean use = true;
    boolean ride = true;

    ZooTicketA(boolean age){
        this.age = age;
    }

    boolean enterZoo(int height){
        if(age && height <= 120 || !age){
            if(use){
                use = false;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    // boolean useRide(){
    //     if(ride && !use){
    //         ride = false;
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
}

public class ZooAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ZooTicketA[] zoo = new ZooTicketA[n];
        for(int i=0; i<n; i++){
            int num = scan.nextInt();
            if(num == 1){
                zoo[i] = new ZooTicketA(false);
            }
            else {
                zoo[i] = new ZooTicketA(true);
            }
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int a = scan.nextInt() - 1;
            int b = scan.nextInt();

            System.out.println(zoo[a].enterZoo(b));
            // if(b == 1){
            //     int c = scan.nextInt();
            //     System.out.println(zoo[a].enterZoo(c));
            // }
            // else {
            //     System.out.println(zoo[a].useRide());
            // }
        }
    }
}
