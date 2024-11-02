import java.util.Scanner;

class Theater{
    boolean threeD = false;
    boolean lux = false;
    int num;
    boolean[] seats;
    String title;
    int baseprice;

    Theater(boolean threeD, boolean lux, int num){
        this.threeD = threeD;
        this.lux = lux;
        this.num = num;
        this.seats = new boolean[num];
    }

    void setTitle(String title){
        if(title != null){
            this.title = title;
        }
        else {
            System.out.println("invalid title");
        }
    }

    void setBasePrice(int baseprice){
        if(baseprice > 0){
            this.baseprice = baseprice;
        }
        else{
            System.out.println("invalid price");
        }
    }

    void printInfo(){
        if(threeD){
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }

        if(lux){
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }

        System.out.println(seats.length);
        if(title == null){
            System.out.println("title is not set");
        }
        else {
            System.out.println(title);
        }

        if(baseprice > 0){
            System.out.println(baseprice);
        }
        else{
            System.out.println("price is not set");
        }
    }

    int reserveOne(int seatNumber){
        int price = -1;
        if(seatNumber < 0 || seatNumber > num-1){
            System.out.println("sorry");
            
        }
        else{
            if(!seats[seatNumber]){
                seats[seatNumber] = true;
                price = baseprice;
            }
            else{
                System.out.println("sorry");
            }
        }
        
        return price;
    }

    int reserveMultiple(int numSeats, int seatNumber){
        int price = -1;
        boolean check = false;
        if(seatNumber < 0 || seatNumber+numSeats > num){
            check = true;
        }
        else{
            for(int i=seatNumber; i<seatNumber+numSeats; i++){
                if(seats[i]){
                    check = true;
                }
            }
        }
        

        if(!check){
            price = baseprice * numSeats;
            for(int i=seatNumber; i<seatNumber+numSeats; i++){
                seats[i] = true;
            }
        }
        else{
            System.out.println("sorry");
        }
        return price;
    }
}

public class Theater1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int d = scan.nextInt();
        int lux = scan.nextInt();
        int num = scan.nextInt();
        scan.nextLine();
    
        boolean D = false;
        boolean luxury = false;
        if(d == 1){
            D = true;
        }
        if(lux == 1){
            luxury = true;
        }

        Theater th = new Theater(D, luxury, num);

        String title = scan.nextLine();
        if(title.equals("-1") || title.length() == 0){
            title = null;
        }
        th.setTitle(title);

        int price = scan.nextInt();
        th.setBasePrice(price);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt() - 1;

            int total;
            if(numberOfSeats == 1){
                total = th.reserveOne(seatNumber);
            }
            else{
                total = th.reserveMultiple(numberOfSeats, seatNumber);
            }

            if(total > 0){
                System.out.println(total);
            }
        }
        th.printInfo();
    }
}
