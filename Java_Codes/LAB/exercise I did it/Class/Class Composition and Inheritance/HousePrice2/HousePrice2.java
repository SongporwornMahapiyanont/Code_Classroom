package HousePrice2;

import java.util.ArrayList;
import java.util.Scanner;
public class HousePrice2 {
    // Do not change the code below this line.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    ArrayList<House> houses = new ArrayList<>(); 
    for(int i=0;i<N;i++)
    {
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
        House house = new House(landSize, quality, floors, houseArea);
        houses.add(house);
    }
    int AcceptPrice = scan.nextInt();
    int AccepthouseArea = scan.nextInt();
    boolean check = false;
    for(int i=0;i<houses.size();i++)
    {
        if(houses.get(i).price <= AcceptPrice && houses.get(i).houseArea >= AccepthouseArea)
        {
            check = true;
            System.out.println(houses.get(i).landSize + " " + houses.get(i).quality + " " + houses.get(i).floors + " " + houses.get(i).houseArea + " " + houses.get(i).price);
        }
    }
    if(!check)
    {
        System.out.println("none");
    }
    scan.close();
    }
   }



