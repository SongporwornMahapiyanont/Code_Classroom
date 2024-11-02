package HousePrice;

class House {
    int landSize, quality, floors, houseArea;
    public int price;
    int Maxprice, MaxArea;

    House(int lan, int qual, int flo, int house) {
        this.landSize = lan;
        this.quality = qual;
        this.floors = flo;
        this.houseArea = house;
        this.Maxprice = Maxprice;
        this.MaxArea = MaxArea;
        this.price = computerPrice(lan, qual, flo, house);
    }

    int computerPrice(int landSize, int quality, int floors, int houseArea) {
        int result = 0;
        if (floors > 1) {
            result = (10000 * landSize) + (200000 * (floors - 1));
            if (quality == 1)
                result += (10000 * houseArea);
            else if (quality == 2)
                result += (8000 * houseArea);
            else if (quality == 3)
                result += (5000 * houseArea);
        } else {
            result = (10000 * landSize);
            if (quality == 1)
                result += (10000 * houseArea);
            else if (quality == 2)
                result += (8000 * houseArea);
            else if (quality == 3)
                result += (5000 * houseArea);
        }
        return result;
    }

}
