import java.util.Scanner;

class Burger{
    String meat;
    boolean lettuce, tomato, pickled;
    int numCheese;
    double price;

    Burger(String meat, boolean lettuce, boolean tomato, boolean pickled, int numCheese){
        this.meat = meat + "BURGER ";
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickled = pickled;

        if(numCheese < 0){
            numCheese = 0;
        }
        if(numCheese > 3){
            numCheese = 3;
        }
        this.numCheese = numCheese;

        price = 49 + (numCheese * 20);
    }

    void printInfo(){
        System.out.print(meat);

        if(lettuce){
            System.out.print("lettuce ");
        }
        if(tomato){
            System.out.print("tomato ");
        }
        if(pickled){
            System.out.print("pickled ");
        }

        System.out.print("cheese" + numCheese);
        System.out.println(" = $" + price);
    }
}

public class Hamburger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String meatorder = scan.next();
        String veg = scan.next();
        int n = scan.nextInt();
        boolean flag_lettuce = (veg.charAt(0) == 'Y'?true:false);
        boolean flag_tomato = (veg.charAt(1) == 'Y'?true:false);
        boolean flag_pickled = (veg.charAt(2) == 'Y'?true:false);

        Burger b = new Burger(meatorder, flag_lettuce, flag_tomato, flag_pickled, n);
        b.printInfo();
    }
}
