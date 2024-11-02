import java.util.Scanner;

class Product{
    String name;
    String sku;
    double price;
    int weight;

    Product(String name, String sku, double price, int weight){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity(){
        boolean check = true;
        if(name.length() == 0 || name == null){
            System.out.println("name is invalid");
            check = false;
        }
        if(sku.length() == 0 || sku == null){
            System.out.println("sku is invalid");
            check = false;
        }
        if(price < 0){
            System.out.println("price is invalid");
            check = false;
        }
        if(weight < 0){
            System.out.println("weight is invalid");
            check = false;
        }
        return check;
    }

    void printInfo(){
        boolean check = true;
        System.out.print(name + ", " + sku + ", " + price + ", " + weight);
        if(name.length() == 0 || name == null || sku.length() == 0 || sku == null || price < 0 || weight < 0){
            check = false;
        }
        if(!check){
            System.out.print(", Invalid");
        }
        System.out.println();
    }
}

class Shoe extends Product{
    int gender;
    int size;
    int type;
    String brand;

    Shoe(String name, String sku, double price, int weight, int gender, int size, int type, String brand){
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }

    @Override
    void printInfo() {
        super.printInfo();
        switch (gender) {
            case 1:
                System.out.print("female");
                break;
            case 2:
                System.out.print("male");
                break;
        }
        System.out.print(", " + size);
        switch (type) {
            case 1:
                System.out.print(", sport");
                break;
            case 2:
                System.out.print(", formal");
                break;
            case 3:
                System.out.print(", casual");
                break;
        }
        System.out.println(", " + brand);
    }
}

public class ProductStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        Product[] pro = new Product[n];
        for(int i=0; i<n; i++){
            scan.nextLine();
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();

            pro[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
        }

        for(int i=0; i<n; i++){
            boolean valid = pro[i].checkValidity();
            System.out.println(valid);
        }
        for(int i=0; i<n; i++){
            pro[i].printInfo();
        }
    }
}
