import java.util.Scanner;

class Bus{
    String id;
    int type;
    private int seats;
    private int currentSeats;
    private boolean broke = true;

    Bus(String id, int type, int seats){
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    void printStats(){
        System.out.println(id);

        if(type == 1){
            System.out.println("Fan");
        }
        else if(type == 2){
            System.out.println("P1");
        }
        else {
            System.out.println("VIP");
        }
         
        System.out.println(currentSeats + " " + seats);
        if(broke) {
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }

    boolean reserve(int k){
        if(k <= 0 || k + currentSeats > seats || !broke){
            return false;
        }
        else{
            currentSeats+=k;
            return true;
        }
    }

    void sendToRepair(){
        broke = false;
    }

    void backToService(){
        broke = true;
    }
}

public class BusCompany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Q = scan.nextInt();
        scan.nextLine();
        Bus[] b = new Bus[Q];
        for(int i=0; i<Q; i++){
            String id = scan.nextLine();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            scan.nextLine();

            b[i] = new Bus(id, type, seats);
        }
        
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();

            if(P == 1){
                boolean check = false;
                for(int j=0; j<Q; j++){
                    if(b[j].type == T){
                        check = b[j].reserve(K);
                        if(check){
                            System.out.println(b[j].id);
                            break;
                        }
                    }
                }
                
                if(!check){
                    System.out.println("sorry");
                }
            }
            else if(P == 2){
                b[T-1].sendToRepair();
            }
            else {
                b[T-1].backToService();
            }
        }
    }
}
