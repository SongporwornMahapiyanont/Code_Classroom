package ProductShipping1;

class SpecialTruck extends Truck {
    SpecialTruck(int capacity) {
        super(capacity);
    }

    @Override
    double getFee() {
        double result = 2 * (p.weight / 1000.0) * stop;
        return result;
    }
}
