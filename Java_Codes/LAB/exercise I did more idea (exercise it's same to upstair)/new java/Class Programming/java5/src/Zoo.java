import java.util.Scanner;

class ZooTicket{
    String name;
    boolean ride;
    boolean seal;
    boolean tiger;

    ZooTicket(String name){
        this.name = name;
    }

    void bookRide(){
        ride = true;
    }

    void bookSealShow(){
        seal = true;
    }

    void bookTigerShow(){
        tiger = true;
    }

    boolean useRide(){
        if(ride){
            ride = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    boolean enterSealShow(){
        if(seal){
            seal = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    boolean enterTigerShow(){
        if(tiger){
            tiger = false;
            System.out.println("okay");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    void summarize(){
        int total_price = 100;
        System.out.println(name);
        if(ride){
            System.out.println("Ride");
            total_price+=40;
        }
        if(seal){
            System.out.println("Seal");
            total_price+=50;
        }
        if(tiger){
            System.out.println("Tiger");
            total_price+=65;
        }
        System.out.println(total_price);
    }
}

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        ZooTicket zoo = new ZooTicket(name);

        for(;;){
            int order = scan.nextInt();
            if(order == 0){
                break;
            }
            else if(order == 1){
                zoo.bookRide();
            }
            else if(order == 2){
                zoo.bookSealShow();
            }
            else {
                zoo.bookTigerShow();
            }
        }
        zoo.summarize();

        //ZOO TICKET 2
        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int use_ticket = scan.nextInt();
            if(use_ticket == 1){
                System.out.println(zoo.useRide());
            }
            else if(use_ticket == 2){
                System.out.println(zoo.enterSealShow());
            }
            else {
                System.out.println(zoo.enterTigerShow());
            }
        }
    }
}
