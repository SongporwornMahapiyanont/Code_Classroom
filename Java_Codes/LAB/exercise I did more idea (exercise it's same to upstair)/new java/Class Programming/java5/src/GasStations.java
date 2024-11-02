import java.util.Scanner;

class GasStation{
    boolean[] fuel = new boolean[6];
    String[] name = {"95S", "91S", "E20", "E85", "B7", "B20"};
    int[] capacity_fuel = new int[6];
    int[] max_fuel = new int[6];

    GasStation(boolean[] fuel, int[] capacity_fuel){
        this.fuel = fuel;
        this.capacity_fuel = capacity_fuel;

        for(int i=0; i<capacity_fuel.length; i++){
            max_fuel[i] = capacity_fuel[i];
        }
    }

    void dispense(int type, int fuel_use){
        if(!fuel[type]){
            System.out.println("Invalid gas type");
        }
        else{
            if(capacity_fuel[type] == 0){
                System.out.println("No gas available");
            }
            else{
                if(capacity_fuel[type] < fuel_use){
                    System.out.println("Dispense " + capacity_fuel[type] + " liters");
                    capacity_fuel[type] = 0;
                }
                else{
                    System.out.println("Dispense " + fuel_use + " liters");
                    capacity_fuel[type]-=fuel_use;
                }
            }
        }
    }

    void refillStation(int type, int fuel){
        if(!this.fuel[type]){
            System.out.println("Invalid gas type");
        }
        else{
            if(capacity_fuel[type] == max_fuel[type]){
                System.out.println("No storage capacity available");
            }
            else{
                if(max_fuel[type] - capacity_fuel[type] < fuel){
                    System.out.println("Refill " + (max_fuel[type] - capacity_fuel[type]) + " liters");
                    capacity_fuel[type] = max_fuel[type];
                }
                else{
                    System.out.println("Refill " + fuel + " liters");
                    capacity_fuel[type] += fuel;
                }
            }
        }
    }

    void report(){
        for(int i=0; i<6; i++){
            if(fuel[i]){
                System.out.print(name[i] + " " + capacity_fuel[i] + ", ");
            }
        }
        System.out.println();
    }
}

public class GasStations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        GasStation[] gas = new GasStation[n];
        for(int i=0; i<n; i++){
            int[] fuel = new int[6];
            boolean[] type_fuel = new boolean[6];
            for(int j=0; j<6; j++){
                fuel[j] = scan.nextInt();
                if(fuel[j] > 0){
                    type_fuel[j] = true;
                }
                else{
                    fuel[j] = 0;
                    type_fuel[j] = false;
                }
            }
            gas[i] = new GasStation(type_fuel, fuel);
        }

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int a = scan.nextInt();
            int s = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            int c = scan.nextInt();

            if(a == 1){
                gas[s].dispense(b, c);
            }
            else if(a == 2){
                gas[s].refillStation(b, c);
            }
            else{
                gas[s].report();
            }
        }
    }
}
