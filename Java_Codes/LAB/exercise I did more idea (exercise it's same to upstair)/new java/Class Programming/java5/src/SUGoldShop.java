import java.util.Scanner;

class Item{
    boolean gold;
    double weight;
    static double sale;
    static double buy;
    static double salePrice;
    static double buyPrice;

    Item(boolean gold, double weight){
        this.gold = gold;
        this.weight = weight;
    }

    Item(double weight){
        gold = true;
        this.weight = weight;
    }

    double saleprice(double goldPrice){
        double price;
        if(gold){
            price = (goldPrice*weight) + (1000*weight);
        }
        else {
            price = (goldPrice*weight);
        }
        salePrice += price;
        sale += weight;
        return price;
    }

    double buyprice(double goldPrice){
        double price;
        if(gold){
            price = (goldPrice * weight * 98) / 100;
        }
        else {
            price = (goldPrice - 100) * weight;
        }
        buyPrice += price;
        buy += weight;
        return price;
    }

    void showdetail(double goldPrice){
        if(gold){
            System.out.print("ornament " + weight + " baht");
        }
        else {
            System.out.print("bar " + weight + " baht");
        }
    }

    void printInfo(){
        System.out.println(sale + " " + salePrice);
        System.out.println(buy + " " + buyPrice);
    }
}

public class SUGoldShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double goldPrice = scan.nextDouble();
        Item item = null;
        for(int i=0; i<n; i++){
            char c = scan.next().charAt(0);
            char type = scan.next().charAt(0);
            double weight = scan.nextDouble();

            if(c == 's'){
                if(type == 't'){
                    item = new Item(true, weight);
                }
                else {
                    item = new Item(false, weight);
                }  
                item.saleprice(goldPrice);

            }
            else {
                if(type == 't'){
                    item = new Item(true, weight);
                }
                else {
                    item = new Item(false, weight);
                }  
                item.buyprice(goldPrice);
            }
        }

        item.printInfo();
    }
}
