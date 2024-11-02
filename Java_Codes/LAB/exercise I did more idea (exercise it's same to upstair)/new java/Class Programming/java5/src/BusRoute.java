import java.util.Scanner;

class Route{
    String[] name;
    int[] distance;
    Route(String[] name, int[] distance){
        this.name = name;
        this.distance = distance;
    }

    void getStopInfo(int n, int out){
        if(n < 0 || n > out-1){
            System.out.println("invalid number");
        }
        else{
            System.out.println(this.name[n] + " " + this.distance[n]);
        }
    }

    void summarizeRoute(){
        int sum = 0;
        for(int i=0; i<this.distance.length; i++){
            sum+=this.distance[i];
        }
        System.out.println(this.name[0] + " " + this.name[this.name.length-1] + " " + sum);
    }

    void getTripInfo(int first, int last){ 
        int sum = 0;
        if(first == last || first > last || first < 0 || last > this.distance.length-1){
            System.out.println("invalid number");
        }
        else{
            for(int i=first+1; i<=last; i++){
                sum+=this.distance[i];
            }
            System.out.println(this.name[first] + " " + this.name[last] + " " + sum);
        }
        
    }
}

public class BusRoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int n = scan.nextInt();
        String[] name = new String[n];
        int[] distance = new int[n];
        for(int i=0; i<n; i++){
            name[i] = scan.next();
            distance[i] = scan.nextInt();
        }

        Route road = new Route(name, distance);

        //BusRoute 1
        // int k = scan.nextInt();
        // for(int i=0; i<k; i++){
        //     int num = scan.nextInt() - 1;
        //     road.getStopInfo(num, n);
        // }

        //BusRoute 2
        // road.summarizeRoute();

        //BusRoute 3
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            road.getTripInfo(x, y);
        }
    }
}
