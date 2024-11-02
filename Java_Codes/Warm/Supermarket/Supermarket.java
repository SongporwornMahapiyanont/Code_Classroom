package Supermarket;

import java.util.ArrayList;
import java.util.Scanner;

class FruitSection {
    ArrayList<Basket> arr_b = new ArrayList<Basket>();
    int MaxPrice, MaxWeight, income;

    FruitSection(int P, int W) {
        this.MaxPrice = P;
        this.MaxWeight = W;
    }

    boolean check(Basket B) {
        if (B.AllPrice >= 500 && B.AllPrice <= MaxPrice && B.AllWeight >= 2 && B.AllWeight <= MaxWeight
                && B.amountFriut >= 3) {
            return true;
        }
        return false;
    }

    void addBasket(Basket B) {
        boolean check = check(B);
        if (check)
            arr_b.add(B);

    }

    void printBasket(int index) {
        if (index < 0 || index > arr_b.size()) {
            System.out.println("invalid");
        } else {
            System.out.print(arr_b.get(index).grape + " " + arr_b.get(index).melon + " " + arr_b.get(index).apple + " "
                    + arr_b.get(index).cherry + " " + arr_b.get(index).pear + " " + arr_b.get(index).kiwi + ", ");
            System.out.println();
        }
    }
}

class Basket {
    int grape, melon, apple, cherry, pear, kiwi;
    int PriceGrape, PriceMelon, PriceCherry, PricePear, PriceKiwi, PriceApple;
    int WeightGrape, WeightMelon, WeightCherry, WeightPear, WeightKiwi, WeightApple;
    int AllPrice = PriceGrape + PriceMelon + PriceCherry + PricePear + PriceKiwi + PriceApple;
    int AllWeight = WeightGrape + WeightMelon + WeightCherry + WeightPear + WeightKiwi + WeightApple;
    int amountFriut;

    Basket(int grape, int melon, int apple, int cherry, int pear, int kiwi) {
        if (grape != 0) {
            this.amountFriut += 1;
        }
        if (melon != 0) {
            this.amountFriut += 1;
        }
        if (apple != 0) {
            this.amountFriut += 1;
        }
        if (cherry != 0) {
            this.amountFriut += 1;
        }
        if (pear != 0) {
            this.amountFriut += 1;
        }
        if (kiwi != 0) {
            this.amountFriut += 1;
        }
        this.grape = grape;
        this.PriceGrape = grape * 120;
        this.WeightGrape = grape * 500;

        this.melon = melon;
        this.PriceMelon = melon * 200;
        this.WeightMelon = (melon * 2000) / 1000;

        this.apple = apple;
        this.PriceApple = apple * 90;
        this.WeightApple = (apple * 300) / 1000;

        this.cherry = cherry;
        this.PriceCherry = cherry * 180;
        this.WeightApple = (cherry * 350) / 1000;

        this.pear = pear;
        this.PricePear = pear * 60;
        this.WeightPear = (pear * 400) / 1000;

        this.kiwi = kiwi;
        this.PriceKiwi = kiwi * 150;
        this.WeightKiwi = (kiwi * 500) / 1000;
    }
}

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int W = sc.nextInt();
        FruitSection fs = new FruitSection(P, W);
        while (true) {
            int grape = sc.nextInt();
            int melon = sc.nextInt();
            int apple = sc.nextInt();
            int cherry = sc.nextInt();
            int pear = sc.nextInt();
            int kiwi = sc.nextInt();
            Basket b = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if (b.type == 0) {
                break;
            } else {
                fs.addBasket(b);
            }
        }
        while (true) {
            String command = sc.next();
            if (command.equals("stop")) {

            } else if (command.equals("print")) {

            } else if (command.equals("printAll")) {

            } else if (command.equals("sell")) {

            }
        }
    }
}
