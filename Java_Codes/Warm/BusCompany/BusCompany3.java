package BusCompany;

import java.util.Scanner;

class Bus {
    String id, check = "Active";
    int type;
    private int seats = 0, Totalseats, P;

    Bus(String id, int type, int seat) {
        this.id = id;
        this.type = type;
        this.Totalseats = seat;
    }

    boolean reserve(int K) {

        if (K < 0 || this.seats + K > Totalseats || check.equals("Inactive")) {
            return false;
        }
        this.seats += K;
        return true;
    }

    void SendToRepair() {
        check = "Inactive";
    }

    void backToService() {
        check = "Active";
    }

    void printStats() {
        System.out.println(id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else if (type == 3) {
            System.out.println("VIP");
        }
        System.out.println(seats + " " + Totalseats);
        System.out.println(check);
    }

}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {

                b.reserve(K);
                b.printStats();
            } else if (P == 2) {
                b.SendToRepair();
                b.printStats();
            } else if (P == 3) {
                b.backToService();
                b.printStats();
            }
        }
    }
}
