package HousePrice;

import java.util.Scanner;

public class HousePrice1 {
    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
    
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);
        scan.close();
    }
}



