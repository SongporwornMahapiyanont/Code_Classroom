package HousePrice;

class House{
    int landSize,quality,floors,houseArea;
    public int price;
    House(int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = computerPrice(landSize, quality, floors, houseArea);
    }
    int computerPrice(int landSize,int quality,int floors,int houseArea){
        int a = 10000*landSize;
        int b=0,c=0;
        if(floors>1)
        {
            b = (floors-1)*200000;
        }
        if(quality==1)
        {
            c = houseArea*10000;
        }
        else if(quality==2)
        {
            c = houseArea*8000;
        }
        else if(quality == 3)
        {
            c = houseArea*5000;
        }
        int sum = a+b+c;
        return sum;
    }
}