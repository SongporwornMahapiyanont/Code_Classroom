package ProductShipping1;

import java.util.Scanner;

public class ProductShipping4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            int type = in.nextInt();
            if (type == 1)
                trucks[i] = new Truck(capacity);
            else
                trucks[i] = new SpecialTruck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {
            if ((trucks[i].netWeight >= po.weight) && (minvalue > trucks[i].netWeight)) {
                minvalue = trucks[i].netWeight;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            double fee = po.weight * dest / 1000.0;
            System.out.println("Fee=" + fee + " " + (2 * fee));
        }
    }
}
