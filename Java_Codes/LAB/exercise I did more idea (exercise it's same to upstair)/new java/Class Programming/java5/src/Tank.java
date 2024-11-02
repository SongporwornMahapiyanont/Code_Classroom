import java.util.Scanner;

class WaterTank{
    int height;
    int wide;
    int l;
    int capacity;
    int volume;

    WaterTank(int wide, int l, int height){
        this.wide = wide;
        this.l = l;
        this.height = height;

        capacity = this.wide * this.l * this.height;
    }

    int fill(int water){
        if(water + volume > capacity){
            System.out.println("Cannot fill the tank");
            return -1;
        }
        else {
            volume+=water;
            return volume;
        }
    }
}

public class Tank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wide = scan.nextInt();
        int l = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(wide, l, height);

        for(int i=0; i<5; i++){
            int water = scan.nextInt();
            System.out.println(tank.fill(water));
        }
    }
}
