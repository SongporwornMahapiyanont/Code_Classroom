import java.util.Scanner;

class House{
    int landSize;
    int quality;
    int floors;
    int houseArea;
    int price;

    House(int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;

        price = computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int landSize, int quality, int floors, int houseArea){
        int total_price = (landSize * 10000) + ((floors-1) * 200000);
        if(quality == 1){
            total_price += (houseArea*10000);
        }
        else if(quality == 2){
            total_price += (houseArea*8000);
        }
        else {
            total_price += (houseArea*5000);
        }
        return total_price;
    }
}

public class HousePrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        House[] house = new House[N];
        for(int i=0; i<N; i++){
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);

        }

        int price_enough = scan.nextInt();
        int house_area = scan.nextInt();
        
        boolean check = false;
        for(int i=0; i<N; i++){
            if(house[i].price <= price_enough && house[i].houseArea >= house_area){
                check = true;
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea + " " + house[i].price);
            }
        }
        if(!check){
            System.out.println("none");
        }
    }
}
