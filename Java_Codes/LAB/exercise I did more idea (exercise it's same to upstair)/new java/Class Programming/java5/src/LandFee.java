import java.util.Scanner;

class Bill{
    String PIN;
    String saleDate;
    int size;
    int price;
    double tax;
    double fee;
    double stamp;

    Bill(String PIN, String saleDate, int size, int price){
        this.PIN = PIN;
        this.saleDate = saleDate;
        this.size = size;
        this.price = price;

        tax = (price*size*3)/100;
        fee = (price*size*5)/100;
        stamp = (price*size*1)/100;
    }

    void printInfo(){
        double total = tax + fee + stamp;
        System.out.println(PIN + " " + saleDate + " " + size + " " + price);
        System.out.println(tax + "+" + fee + "+" + stamp + "=" + total);
    }
}

public class LandFee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Bill[] bill = new Bill[n];
        scan.nextLine();
        for(int i=0; i<n; i++){
            String PIN = scan.next();
            String saleDate = scan.next();
            int size = scan.nextInt();
            int price = scan.nextInt();

            bill[i] = new Bill(PIN, saleDate, size, price);
            bill[i].printInfo();
        }
    }
}
