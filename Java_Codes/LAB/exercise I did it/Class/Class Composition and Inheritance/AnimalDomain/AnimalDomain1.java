package AnimalDomain;

import java.util.Scanner;
import java.util.ArrayList;
public class AnimalDomain1 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            ArrayList<Animal> animal = new ArrayList<>();
            for(int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                if(type == 1) {
                    String name = scan.next();
                    int lifeExpect = scan.nextInt();
                    animal.add(new Animal(name, lifeExpect));
                } 
                else if(type == 2) {
                    int id = scan.nextInt();
                    int year = scan.nextInt();
                    animal.get(id-1).live(year);
                } 
                else if(type == 3) {
                    int id = scan.nextInt();
                    animal.get(id-1).isAlive();
                }
                scan.close();
            }
        }
}
