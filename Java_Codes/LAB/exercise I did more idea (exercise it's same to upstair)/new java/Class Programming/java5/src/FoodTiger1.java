import java.util.Scanner;

class FoodShop{
    String nameShop;
    int nFood;
    String[] menu = new String[5];

    FoodShop(String nameShop){
        this.nameShop = nameShop;
    }

    // FoodTiger 1
    // boolean addFood(){
    //     if(nFood + 1 <= 5){
    //         nFood++;
    //         System.out.print(nFood + " ");
    //         return true;
    //     }
    //     else{
    //         System.out.print("-1 ");
    //         return false;
    //     }
    // }

    // void printMenu(){
    //     System.out.println(nameShop + " " + nFood);
    // }


    //FoodTiger 2
    boolean addFood(String name_menu){
        if(nFood + 1 <= 5){
            menu[nFood] = name_menu;
            nFood++;
            System.out.print(nFood + " ");
            return true;
        }
        else{
            System.out.print(-1 + " ");
            return false;
        }
    }

    void printMenu(){
        System.out.print(nameShop);
        for(int i=0; i<nFood; i++){
            System.out.print(menu[i]);
        }
        System.out.println();
    }

}

public class FoodTiger1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        FoodShop[] fs = new FoodShop[n];
        for(int i=0; i<n; i++){
            String nameShop = scan.nextLine();
            fs[i] = new FoodShop(nameShop);
        }

        //FoodTiger 1
        // int k = scan.nextInt();
        // for(int i=0; i<k; i++){
        //     int num = scan.nextInt() - 1;
        //     System.out.println(fs[num].addFood());
        // }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int num = scan.nextInt() - 1;
            String menu = scan.nextLine();

            System.out.println(fs[num].addFood(menu));
        }

        for(int i=0; i<n; i++){
            fs[i].printMenu();
        }
    }
}
