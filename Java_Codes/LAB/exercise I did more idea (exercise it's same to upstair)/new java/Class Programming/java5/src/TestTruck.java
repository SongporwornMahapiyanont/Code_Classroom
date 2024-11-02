import java.util.Scanner;

class Truck12{
    int weight;
    int amount;

    Truck12(int weight, int amount){
        this.weight = weight;
        this.amount = amount;
    }

    double calFuel(double distance){
        double fuel = (distance + weight) / 10.0;
        fuel = Math.ceil(fuel);
        return fuel;
    }
}

class GasStation12{
    double[] amount;

    GasStation12(double[] amount){
        this.amount = amount;
    }

    void fillTank(int type, Truck12 truck, double distance){
        double fuel_want = truck.calFuel(distance);
        if(amount[type] >= fuel_want){
            amount[type] -= fuel_want;
        }
        else {
            System.out.println((type + 1) + "out of gasoline");
        }
    }

    void refuel(double[] fuel){
        for(int i=0; i<amount.length; i++){
            amount[i] += fuel[i];
        }
    }

    void print(){
        for(int i=0; i<amount.length; i++){
            System.out.print(amount[i] + " ");
        }
        System.out.println();
    }
}

public class TestTruck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Truck12[] truck = new Truck12[n];
        for(int i=0; i<n; i++){
            int weight = scan.nextInt();
            int amount = scan.nextInt();

            truck[i] = new Truck12(weight, amount);
        }

        int k = scan.nextInt();
        double[] amount_fuel = new double[k];
        for(int i=0; i<k; i++){
            amount_fuel[i] = scan.nextDouble();
        }
        GasStation12 gs = new GasStation12(amount_fuel);

        int m = scan.nextInt();
        for(int i=0; i<m; i++){
            int order = scan.nextInt();
            if(order == 0){
                int x = scan.nextInt() -1;
                int type = scan.nextInt() -1;
                double distance = scan.nextDouble();

                gs.fillTank(type, truck[x], distance);
                
            }
            else {
                double[] fuel = new double[k];
                for(int j=0; j<k; j++){
                    fuel[j] = scan.nextDouble();
                }
                gs.refuel(fuel);
            }
            gs.print();
        }
    }
}
