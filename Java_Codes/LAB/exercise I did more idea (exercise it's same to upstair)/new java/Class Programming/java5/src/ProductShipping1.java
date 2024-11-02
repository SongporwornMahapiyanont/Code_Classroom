import java.util.Scanner;

class PtwMath{

    static double ceil(double num){
        double final_num = (int) num;
        double final_plus = 0;
        int count = 0;
        for(;;){
            count++;
            double ceil = (num - (int) num) * 10;
            int ceil_int = (int) ceil;
            if(ceil_int == 0 && count > 1){
                break;
            }
            if(ceil_int == 9 && count > 1){
                double nfirst = 1;
                for(int i=0; i<count-1; i++){
                    nfirst /= 10.0;
                }
                final_plus += nfirst;
                break;
            } 
            num = ceil;
            double plus_ceil = ceil_int;
            for(int i=0; i<count; i++){
                plus_ceil /= 10.0;
            }
            final_plus += plus_ceil;
        }
        final_num += final_plus;
        return final_num;
    }
}


class Product{
    String name;
    int weight;
    int price;

    Product(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo(){
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}

class PurchaseOrder{
    int nProduct;
    Product[] products;
    int[] amount;
    int total_price = 0;
    int total_weight = 0;

    PurchaseOrder(int nProduct, Product[] products, int[] amount){
        this.nProduct = nProduct;
        this.products = products;
        this.amount = amount;

        for(int i=0; i<nProduct; i++){
            total_price += products[i].price * amount[i];
            total_weight += products[i].weight * amount[i];
        } 
    }

    void printInfo(){
        
        System.out.println(nProduct + " items = " + total_price + " baht " + total_weight + " grams");

        for(int i=0; i<nProduct; i++){
            int price = products[i].price * amount[i];
            System.out.println(products[i].name + " " + amount[i] + "x" + products[i].price + " = " + price);
        }
    }
}

class Truck{
    int capacity;
    int orderID;
    int station;
    double shipping;
    PurchaseOrder po;

    Truck(int capacity){
        this.capacity = capacity;
        station = 0;
        shipping = 0;
    }

    void add(PurchaseOrder po, int station){
        this.po = po;
        this.station = station;

        setFee();
    }

    void setFee(){
        double fee = (po.total_weight / 1000.0) * station;
    }

    double getFee(){
        double fee = (po.total_weight / 1000.0) * station;
        fee = PtwMath.ceil(fee);
        return fee;
    }
}

class SpecialTruck extends Truck{
    SpecialTruck(int capacity){
        super(capacity);
    }

    @Override void setFee(){
        double fee = (po.total_weight / 1000.0) * station;
        fee *= 2;
    }

    @Override double getFee(){
        double fee = (po.total_weight / 1000.0) * station;
        fee = PtwMath.ceil(fee);
        return fee*2;
    }
}

public class ProductShipping1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ProductShipping 1
        // int n = scan.nextInt();
        // for(int i=0; i<n; i++){
        //     String name = scan.next();
        //     int weight = scan.nextInt();
        //     int price = scan.nextInt();

        //     Product p = new Product(name, weight, price);
        //     p.printInfo();
        // }

        //ProductShipping 2
        // int n = scan.nextInt();
        // Product[] products = new Product[n];
        // int[] amount = new int[n];
        // for(int i=0; i<n; i++){
        //     String name = scan.next();
        //     int weight = scan.nextInt();
        //     int price = scan.nextInt();
        //     products[i] = new Product(name, weight, price);
        //     amount[i] = scan.nextInt();
        // }
        // PurchaseOrder po = new PurchaseOrder(n, products, amount);
        // po.printInfo();

        //ProductShipping 3
        // int m = scan.nextInt();
        // Truck[] trucks = new Truck[m];
        // for(int i=0; i<m; i++){
        //     int capacity = scan.nextInt();
        //     trucks[i] = new Truck(capacity);
        // }
        // int n = scan.nextInt();
        // int dest = scan.nextInt();
        // Product[] products = new Product[n];
        // int[] amount = new int[n];
        // for(int i=0; i<n; i++){
        //     String name = scan.next();
        //     int weight = scan.nextInt();
        //     int price = scan.nextInt();
        //     products[i] = new Product(name, weight, price);
        //     amount[i] = scan.nextInt();
        // }
        // PurchaseOrder po = new PurchaseOrder(n, products, amount);
        // int minvalue = Integer.MAX_VALUE;
        // int minIndex = -1;
        // for(int i=0; i<m; i++){
        //     if((trucks[i].capacity >= po.total_weight) && (minvalue>trucks[i].capacity)){
        //         minvalue = trucks[i].capacity;
        //         minIndex = i;
        //     }
        // }
        // if(minIndex >= 0){
        //     trucks[minIndex].add(po, dest);
        //     System.out.println("Truck#" + (minIndex+1));
        //     System.out.println("Fee=" + trucks[minIndex].getFee());
        // }
        // else{
        //     System.out.println("No truck");
        //     System.out.println("Fee=" + po.total_weight*dest/1000.0);
        // }

        //ProductShipping 4
        int m = scan.nextInt();
        Truck[] trucks = new Truck[m];
        for(int i=0; i<m; i++){
            int capacity = scan.nextInt();
            int type = scan.nextInt();
            if(type == 1){
                trucks[i] = new Truck(capacity);
            }
            else {
                trucks[i] = new SpecialTruck(capacity);
            }
        }
        int n = scan.nextInt();
        int dest = scan.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for(int i=0; i<n; i++){
            String name = scan.next();
            int weight = scan.nextInt();
            int price = scan.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = scan.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i<m; i++){
            if((trucks[i].capacity >= po.total_weight) && (minvalue>trucks[i].capacity)){
                minvalue = trucks[i].capacity;
                minIndex = i;
            }
        }
        if(minIndex >= 0){
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex+1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        }
        else{
            System.out.println("No truck");
            double fee = po.total_weight*dest/1000.0;
            System.out.println("Fee=" + fee + " " + fee*2);
        }
    }
}
