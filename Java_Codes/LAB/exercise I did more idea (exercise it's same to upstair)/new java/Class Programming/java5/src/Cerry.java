import java.util.Scanner;

class Ship{
    int capacity;
    static int weight = 0;
    static int target = 0;

    Ship(int capacity){
        if(capacity < 0){
            this.capacity = 10;
        }
        else {
            this.capacity = capacity;
        }
    }

    int load(int[] weight_container, int first_container){
        int weight = 0;
        for(int i=first_container; i<weight_container.length; i++){
            if(weight + weight_container[i] <= capacity){
               weight += weight_container[i]; 
                target = i+1;
            }
            else {
                break;
            }
        }

        this.weight += weight;
        return target;
    }
}

public class Cerry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] boat = new int[n];
        int[] container = new int[k];
        for(int i=0; i<n; i++){
            boat[i] = scan.nextInt();
        }
        
        for(int i=0; i<k; i++){
            container[i] = scan.nextInt();
        }

        int first = 0;
        for(int i=0; i<n; i++){
            if(first == container.length){
                break;
            }
            Ship ship = new Ship(boat[i]);     
            first = ship.load(container, first);
        }

        System.out.println(first + " "  + (new Ship(0)).weight);
    }
}
