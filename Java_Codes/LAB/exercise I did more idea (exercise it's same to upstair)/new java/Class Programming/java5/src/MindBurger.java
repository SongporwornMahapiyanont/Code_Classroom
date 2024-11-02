import java.util.Scanner;

class Burger{
    String meat;
    boolean lettuce, tomato, pickled;
    int numCheese;
    double price;

    Burger(String meat, boolean lettuce, boolean tomato, boolean pickled, int numCheese){
        this.meat = meat + "BURGER";
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

class SetBurger{
    static String[] beverageChoice = {"","Coke","Sprite","GreenTea","Lemonade"};
    Burger burger;
    String beverage;
    int sizeFrenchfries;
    double baseprice;
    double discount;
    int priceBeverage;

    SetBurger(Burger burger, int choice, int size){
        this.burger = burger;
        this.beverage = beverageChoice[choice];
        int numBev = ((choice!=0)?1:0);
        sizeFrenchfries = size;
        priceBeverage = (39 * numBev);
        baseprice = burger.price + (39 * numBev) + (15 * sizeFrenchfries);
        discount = promotion();
    }

    double promotion(){
        double discount = 0;
        if(beverage.length() != 0 && sizeFrenchfries != 0){
            discount = 25;
        }
        else if(beverage.length() == 0 && sizeFrenchfries == 0){
        }
        else {
            discount = 10;
        }
        return discount;

    }

    void printInfo(){
        System.out.println(burger.price + ":" + priceBeverage + ":" + sizeFrenchfries);
        System.out.print(burger.meat);
        if(beverage.length() != 0){
            System.out.print("+" + beverage);
        }
        if(sizeFrenchfries != 0){
            System.out.print("+fries ");
            if(sizeFrenchfries == 1){
                System.out.print("S");
            }
            else if(sizeFrenchfries == 2){
                System.out.print("M");
            }
            else {
                System.out.print("L");
            }
        }
        System.out.println(" = $" + (baseprice * (100-discount) / 100));
    }
}

public class MindBurger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String meat = scan.next();
        String veg = scan.next();
        int n = scan.nextInt();
        boolean flag_lettuce = (veg.charAt(0)=='Y'?true:false);
        boolean flag_tomato = (veg.charAt(1)=='Y'?true:false);
        boolean flag_pickled = (veg.charAt(2)=='Y'?true:false);
        Burger b = new Burger(meat, flag_lettuce, flag_tomato, flag_pickled, n);
        int beverageChoice = scan.nextInt(); 
        if (beverageChoice < 0 || beverageChoice >= SetBurger.beverageChoice.length){
            System.out.println("invalid choice of beverage, then let try lemonade");
            beverageChoice = 4;
        }
        int fries_size = scan.nextInt();
        if (fries_size<0 || fries_size > 3){
            System.out.println("invalid size of fries, then take a small one");
            fries_size = 1;
        }
        SetBurger setburger = new SetBurger(b, beverageChoice, fries_size);
        setburger.printInfo();
    }
}
