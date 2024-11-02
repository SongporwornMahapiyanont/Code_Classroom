import java.util.Scanner;

class FoodOrder{
    String name;
    int foodTotal;
    int grandTotal;

    FoodOrder(String name){
        this.name = name;
    }

    void addFood(int price){
        foodTotal += price;
    }

    void finalizeReceipt(){
        int delivery_cost = 0;
        System.out.println(name);
        
        if(foodTotal <= 50){
            delivery_cost = 20;
        }
        else if(foodTotal <= 150){
            delivery_cost = 10;
        }
        
        grandTotal = delivery_cost + foodTotal;
        System.out.println(foodTotal);
        System.out.println(delivery_cost);
        System.out.println(grandTotal);
    }

    void distribIncome(){
        int rider;
        int grabPanda;
        int foodSeller;
        
        if(foodTotal <= 200){
            rider = 20;
        }
        else {
            rider = 30;
        }

        grabPanda = (foodTotal * 3) / 10;
        foodSeller = grandTotal - rider - grabPanda;

        System.out.println("Rider: " + rider);
        System.out.println("GrabPanda: " + grabPanda);
        System.out.println("Food Seller: " + foodSeller);
    }
}

public class GrabPanda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        FoodOrder food = new FoodOrder(name);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int price = scan.nextInt();
            food.addFood(price);
        }

        food.finalizeReceipt();
        food.distribIncome();
    }
}
