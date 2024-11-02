import java.util.ArrayList;
import java.util.Scanner;

class Animal{
    String name;
    int lifeExpect;
    int age;
    boolean alive = true;

    Animal(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        age = 0;
        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
    }

    void live(int year){
        if(!alive){
            System.out.print(name + " died earlier");
        }
        else {
            int a = lifeExpect - age;
            if(age + year < lifeExpect){
                System.out.print(name + " lived " + year + " more ");
                age += year;
            }
            else {
                System.out.print(name + " lived " + (lifeExpect - age) + " more ");
                age = lifeExpect;
                alive = false;
            }

            if(year == 1 || a == 1){
                System.out.print("year");
            }
            else {
                System.out.print("years");
            }

            if(age == lifeExpect){
                System.out.print(" and died");
                alive = false;
            }
        }
        System.out.println();
    }

    boolean isAlive(){
        if(age == lifeExpect){
            System.out.println(name + " is dead");
            alive = false;
            return false;
        }
        else {
            System.out.println(name + " is alive");
            return true;
        }
    }

    void vaccine(){
        System.out.println(name + "'s life expectancy is now " + lifeExpect + " year(s)");
    }
}

class Dog extends Animal{
    boolean checkFirst = false;
    Dog(String name){
        super(name, 8);
        this.name = name;
    }

    @Override void vaccine(){
        if(!checkFirst){
            this.lifeExpect = (lifeExpect * 2) - age;          
        }
        System.out.println(name + "'s life expectancy is now " + lifeExpect + " year(s)");
        checkFirst = true;
    }
}

class Turtle extends Animal{
    Turtle(String name){
        super(name, 50);
        this.name = name;
    }
}

class Salmon extends Animal{
    Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDomain {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<>();

        // int n = scan.nextInt();
        // for(int i=0; i<n; i++){
        //     int type = scan.nextInt();
        //     if(type == 1){
        //         String name = scan.next();
        //         int lifeExpect = scan.nextInt();

        //         animal.add(new Animal(name, lifeExpect));
        //     }
        //     else if(type == 2){
        //         int id = scan.nextInt() - 1;
        //         int year = scan.nextInt();

        //         animal.get(id).live(year);
        //     }
        //     else {
        //         int id = scan.nextInt() - 1;

        //         animal.get(id).isAlive();
        //     }
        // }

        //ANIMAL 2
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int order = scan.nextInt();
            if(order == 1){
                int type = scan.nextInt();
                String name = scan.next();
                if(type == 1){
                    animal.add(new Dog(name));
                }
                else if(type == 2){
                    animal.add(new Turtle(name));
                }
                else {
                    animal.add(new Salmon(name));
                }
            }
            else if(order == 2){
                int p = scan.nextInt() - 1;
                int k = scan.nextInt();

                animal.get(p).live(k);
            }
            else if(order == 3){
                int p = scan.nextInt() - 1;

                animal.get(p).isAlive();
            }
            else if(order == 4){
                int p = scan.nextInt() - 1;

                animal.get(p).vaccine();
            }
        }
    }
}
