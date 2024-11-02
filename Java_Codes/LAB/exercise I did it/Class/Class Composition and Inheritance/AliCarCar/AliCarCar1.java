package AliCarCar;


import java.util.Arrays;
import java.util.Scanner;

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        int count=0;
        // ArrayList<Car> carr = new ArrayList<>();
        for(int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if(Car.check(name, price, labor))  // I am not create Object of Car before. I choose to call method check(static) in Class Car  because It's must not create Object.
            {
                count+=1;
                cars[count-1] = new Car(i, name, price, labor); // I create Object for call Car
                // carr.add(cars[i]);
                // System.out.println("valid");
            } 
        }
        System.out.println(Arrays.toString(cars));
        Factory[] f = new Factory[5];
        for(int i=0;i<5;i++)
        {
            int labor = scan.nextInt();
            boolean[] c = new boolean[N];
            for(int j=0;j<N;j++)
            {
                int value = scan.nextInt();
                if(value == 1)
                {
                    c[j] = true;
                }
                else
                {
                    c[j] = false;
                }
            }
            f[i] = new Factory(cars, c, labor);
        }

        int K = scan.nextInt();
        for(int i=0;i<K;i++)
        {
            int signature = scan.nextInt();
            boolean y = false;
            for(int j=0;j<5;j++)
            {
                if(signature>count)
                {
                    y = true;
                    System.out.println("invalid model");
                    break;
                }
                boolean CAR = f[j].CHECK(signature-1);
                if(CAR == true)
                {
                    y = true;
                    System.out.println("okay" + " " + (j+1));
                    break;
                }
            }
            if(!y)
            {
                System.out.println("unable to build");
            }
        }
        scan.close();
        // for(int i=0;i<count;i++){
        //     System.out.println(i+1 + " " + cars[i].name);
        // }
    }
}
