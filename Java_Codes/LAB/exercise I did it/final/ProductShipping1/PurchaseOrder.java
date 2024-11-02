package ProductShipping1;

class PurchaseOrder {
    int n;
    Product[] product;
    int[] amount;
    int price, weight;

    PurchaseOrder(int n, Product[] product, int[] amount) {
        this.n = n;
        this.product = product;
        this.amount = amount;
        for (int i = 0; i < n; i++) {
            price += (amount[i] * product[i].price);
            weight += (amount[i] * product[i].weight);
        }
    }

    void printInfo() {
        System.out.println(this.n + " items = " + price + " baht " + weight + " grams");
        for (int i = 0; i < n; i++) {
            System.out.println(product[i].name + " " + amount[i] + "x" + product[i].price + " = "
                    + (amount[i] * product[i].price));
        }
    }
}
