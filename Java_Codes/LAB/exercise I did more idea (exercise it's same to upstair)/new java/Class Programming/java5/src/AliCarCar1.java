import java.util.Scanner;

class Car{
    int ID;
    String name;
    int price;
    int work;

    Car(int ID, String name, int price, int work){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.work = work;
    }

    static boolean check(String name, int price, int work){
        if(name.length() != 0 && price > 0 && work > 0){
            return true;
        }
        else{
            return false;
        }
    }
}

class Factory{
    Car[] cars;
    boolean[] can;
    boolean[] can1;
    int work;

    Factory(Car[] cars, boolean[] can, int work){
        this.cars = cars;
        this.can = can;
        this.work = work;
    }

    boolean build(int type){
        if(can[type] && work >= cars[type].work){
            this.work -= cars[type].work;
            return true;
        }
        else {
            return false;
        }
    }
}

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Car[] cars = new Car[n];
        scan.nextLine();

        int count = 1;
        for(int i=0; i<n; i++){
            String name = scan.next();
            int price = scan.nextInt();
            int work = scan.nextInt();

            if(Car.check(name, price, work)){
                cars[count-1] = new Car(count, name, price, work);
                count++;
            }
        }

        Factory[] fac = new Factory[5];
        for(int i=0; i<5; i++){
            int work = scan.nextInt();
            boolean[] can1 = new boolean[n];
            for(int j=0; j<n; j++){
                int can = scan.nextInt();
                if(can == 1){
                    can1[j] = true;
                }
                else{
                    can1[j] = false;
                }
            }

            fac[i] = new Factory(cars, can1, work);
        }

        count--;

        // for(int i=0; i<count; i++){
        //     System.out.println(i+1 + " " + cars[i].name + " " + cars[i].work);
        // }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int type = scan.nextInt() - 1;

            boolean check = false;
            for(int j=0; j<5; j++){
                if(type > count-1 || type < 0){
                    System.out.println("invalid model");
                    check = true;
                    break;
                }
                if(fac[j].build(type)){
                    System.out.println("okay " + (j+1));
                    check = true;
                    break;
                }
            }

            if(!check){
                System.out.println("unable to build");
            }
        }
    }
}
