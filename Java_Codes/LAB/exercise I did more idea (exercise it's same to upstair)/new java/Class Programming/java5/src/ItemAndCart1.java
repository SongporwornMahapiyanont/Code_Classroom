import java.util.Scanner;

class Item12{
    String name;
    String ID;
    int price;
    int shipping;
    int volume;
    int quan;
    boolean valid;

    Item12(String name, String ID, int price, int shipping, int volume, int quan){
        this.name = name;
        this.ID = ID;
        this.price = price; 
        this.shipping = shipping;
        this.volume = volume;
        this.quan = quan;

        valid = basicCheck(name, ID, price, shipping, volume);
    }

    boolean basicCheck(String name, String ID, int price, int shipping, int volume){
        if(name.length() >= 3 && ID.length() >= 3 && name != null && ID != null && price > 0 && volume > 0 && shipping >= 0){
            return true;
        }
        else {
            return false;
        }
    }

    boolean cutStock(int n){
        if(n > quan){
            return false;
        }
        else {
            quan -= n;
            return true;
        }
    }

    void printInfo(){
        System.out.println(name + " " + ID + " " + price);
        System.out.println(shipping + " " + volume + " " + quan + " " + valid);
    }
}

class Cart{
    int capacity;
    Item12 item;
    int itemInCart = 0;
    int total_price = 0;
    int total_shipping = 0;


    Cart(int capacity, Item12 item){
        this.capacity = capacity;
        this.item = item;
    }

    void printStats(){
        System.out.print(itemInCart + " " + total_price + " " + total_shipping + " " + (total_price + total_shipping) + " ");
        if(itemInCart == 0){
            System.out.println(0);
        }
        else if(itemInCart * item.volume <= capacity){
            System.out.println(1);
        }
        else {
            System.out.println("2+");
        }
    }

    boolean adjustQuan(int n){
        boolean check = false;
        if(n >= 0){
            if(item.cutStock(n)){
                total_price += item.price*n;
                total_shipping += item.shipping*n;
                itemInCart += n;
                check = true;
            }
        }
        else {
            if((n * -1) <= itemInCart){
                total_price += item.price*n;
                total_shipping += item.shipping*n;
                itemInCart += n;
                item.quan -= n;
                check = true;
            }
        }
        return check;
    }
}

public class ItemAndCart1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ItemAndCart 1
        // String name = scan.next();
        // String ID = scan.next();
        // int price = scan.nextInt();
        // int shipping = scan.nextInt();
        // int volume = scan.nextInt();
        // int quan = scan.nextInt();

        // Item12 item = new Item12(name, ID, price, shipping, volume, quan);
        // item.printInfo();

        // int n = scan.nextInt();
        // for(int i=0; i<n; i++){
        //     int q = scan.nextInt();
        //     System.out.println(item.cutStock(q));
        //     item.printInfo();
        // }

        //ItemAndCart 2
        String name = scan.next();
        String ID = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();

        Item12 item = new Item12(name, ID, price, shipping, volume, quan);
        int capacity = scan.nextInt();
        Cart cart = new Cart(capacity, item);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int q = scan.nextInt();
            System.out.println(cart.adjustQuan(q));
            cart.printStats();
        }
    }
}
