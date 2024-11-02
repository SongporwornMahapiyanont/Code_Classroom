import java.util.Scanner;
class FoodOrderr {
    String name;
    int foodTotal = 0;
    int grandTotal = 0;
    int rider = 0;
    int seller = 0;
    int grab = 0;
    FoodOrderr(String name){
        this.name = name;
    }
    void addFoodd(int price){
        this.foodTotal+=price;
    }

    void finalizeReceiptt(){
        System.out.println(name);
        System.out.println(foodTotal);
        this.grandTotal = foodTotal;
        if(foodTotal <= 50 )
        {
            System.out.println("20");
            grandTotal+=20;
            seller+=20;
        }
        else if(foodTotal > 50 && foodTotal<= 150)
        {
            System.out.println("10");
            grandTotal+=10;
            seller+=10;
        }
        else
        {
            System.out.println("0");
        }
        System.out.println(grandTotal);
    }
    void distribIncome(){
        
        if(foodTotal <= 200)
        {
            rider+=20;
            grab+=(foodTotal*3)/10;
            seller+=(foodTotal-rider)-grab;
        }
        else if(foodTotal > 200)
        {
            rider+=30;
            grab+=(foodTotal*3)/10;
            seller+=(foodTotal-rider)-grab;
        }
        System.out.println("Rider: " + rider);
        System.out.println("GrabPanda: " + grab);
        System.out.println("Food Seller: " + seller);
    }
}
public class GrabPanda2 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();

        FoodOrderr order = new FoodOrderr(name);
        for(int i = 0; i < N; ++i) {
            int price = scan.nextInt();
            order.addFoodd(price);
        }
        order.finalizeReceiptt();
        order.distribIncome();
    }
}