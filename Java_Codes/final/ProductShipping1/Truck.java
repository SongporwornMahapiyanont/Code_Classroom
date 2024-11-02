package ProductShipping1;

class Truck {
    int netWeight, stop;
    double Shippingcost;
    PurchaseOrder p;

    Truck(int capacity) {
        this.netWeight = capacity;
        this.stop = 0;
        this.Shippingcost = 0;
    }

    void add(PurchaseOrder pur, int dest) {
        this.p = pur;
        this.stop = dest;
        setFee();
    }

    void setFee() {
        double result = (p.weight / 1000.0) * stop;
    }

    double getFee() {
        double result = (p.weight / 1000.0) * stop;
        // System.out.println("weight = " + p.weight);
        // System.out.println(stop);
        // System.out.println(result);
        return result;
    }
}
