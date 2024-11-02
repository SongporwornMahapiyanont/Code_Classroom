package AliCarCar;

class Car {
    String name;
    int price,labor,i;
    Car(int i , String name ,int price ,int labor){
        this.i = i+1;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }
    static boolean check(String name,int price,int labor){
        if(!(name.equals(null)) && name.length()>0 && price>0 && labor>0)
        {
            return true;
        }
        return false;
    }
}

