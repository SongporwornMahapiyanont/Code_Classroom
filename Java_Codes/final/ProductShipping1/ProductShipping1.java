package ProductShipping1;

import java.util.Scanner;

public class ProductShipping1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            Product p = new Product(name, weight, price);
            p.printInfo();
        }
        in.close();
    }
}