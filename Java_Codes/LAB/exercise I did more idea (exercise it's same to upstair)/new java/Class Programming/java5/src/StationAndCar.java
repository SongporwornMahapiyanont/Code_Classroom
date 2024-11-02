import java.util.Scanner;

class Station{
    int benzin;
    int diesel;

    Station(int benzin, int diesel){
        this.benzin = benzin;
        this.diesel = diesel;
    }

    void dispense(Car12 car){
        int gasType = car.gasType;
        int want = car.getNeededVol();
        if(gasType == 1){
            int dipense = 0;
            if(benzin - want < 0){
                dipense = benzin;
            }
            else{
                dipense = want;
            }
            benzin -= dipense;
            System.out.println("Dispense " + dipense + " liters of benzin");
        }
        else {
            int dipense = 0;
            if(diesel - want < 0){
                dipense = diesel;
            }
            else{
                dipense = want;
            }
            diesel -= dipense;
            System.out.println("Dispense " + dipense + " liters of diesel");
        }
    }

    void refillBenzin(int benzin){
        this.benzin += benzin;
        System.out.println("Station has " + this.benzin + " liters of benzin");
    }

    void refillDiesel(int diesel){
        this.diesel += diesel;
        System.out.println("Station has " + this.diesel + " liters of diesel");
    }
}

class Car12{
    int gasType;
    int maxTank;
    int fuel;

    Car12(int gasType, int maxTank, int fuel){
        this.gasType = gasType;
        this.maxTank = maxTank;
        this.fuel = fuel;
    }

    int getNeededVol(){
        int want = maxTank - fuel;
        return want;
    }
}

public class StationAndCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station st = new Station(benzin, diesel);

        final int q = scan.nextInt();
        for(int i=0; i<q; i++){
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();

            Car12 car = new Car12(B, C, D);
            if(A == 1){
                st.dispense(car);
            }
            else {
                if(B == 1){
                    st.refillBenzin(C);
                }
                else {
                    st.refillDiesel(C);
                }
            }
        }
    }
}
