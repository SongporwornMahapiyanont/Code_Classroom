package HousePrice;

import java.util.Scanner;

public class HousePrice2 {
    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        House[] house = new House[N];
        for (int i = 0; i < N; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int Maxprice = scan.nextInt();
        int MaxArea = scan.nextInt();
        boolean check = false;
        for (int i = 0; i < house.length; i++) {
            if (house[i].price <= Maxprice && house[i].houseArea >= MaxArea) {
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " "
                        + house[i].houseArea + " " + house[i].price);
                check = true;
            }

        }
        if (!check)
            System.out.println("none");
        scan.close();
    }
}