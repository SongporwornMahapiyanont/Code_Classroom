import java.util.ArrayList;
import java.util.Scanner;

class ProductInfo{
    public String name;
    public int cheap;
    public int expensive;
    
    ProductInfo(String name, int[] price){
        this.name = name;

        cheap = Integer.MAX_VALUE;
        expensive = Integer.MIN_VALUE;

        for(int i=0; i<price.length; i++){
            if(price[i] > expensive){
                expensive = price[i];
            }
            if(price[i] < cheap){
                cheap = price[i];
            }
        }
    }

    void printInfo(){
        System.out.println(name + " " + cheap + " " + expensive);
    }

}

class Store{
    private ArrayList<ProductInfo> products = new ArrayList<>();

    void enterProductInfo(Scanner scan){
        scan.nextLine();
        String name = scan.nextLine();
        int n = scan.nextInt();
        int[] price = new int[n];
        for(int i=0; i<n; i++){
            price[i] = scan.nextInt();
        }

        products.add(new ProductInfo(name, price));
    }

    void printAllProductInfo(){
        for(int i=0; i<products.size(); i++){
            products.get(i).printInfo();
        }
    }

    ArrayList<ProductInfo> search(String keyword){
        ArrayList<ProductInfo> search = new ArrayList<>();
        for(int i=0; i<products.size(); i++){
            if(products.get(i).name.contains(keyword)){
                search.add(products.get(i));
            }
        }
        return search;
    }
}

public class FindBestDeal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        Store str = new Store();
        for(int i=0; i<n; i++){
            str.enterProductInfo(scan);
        }

        String productName = scan.next();
        ArrayList<ProductInfo> search = str.search(productName);
        System.out.println(search.size());
        if(search.size() == 0){
            System.out.println("product not found");
        }
        for(int i=0; i<search.size(); i++){
            search.get(i).printInfo();
        }
    }
}
