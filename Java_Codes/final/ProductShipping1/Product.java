package ProductShipping1;

class Product {
    String name;
    int weight, price;

    Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo() {
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}
