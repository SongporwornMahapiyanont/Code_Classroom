package AliCarCar;


class Factory {
    Car[] cars;
    boolean[] check;
    boolean[] check1;
    int labor;
    Factory(Car[] cars ,boolean[] check,int labor){
        this.cars = cars;
        this.check = check;
        this.check1 = check;
        this.labor = labor;
    }
    boolean CHECK(int signature){
        if(check[signature] && this.labor >= cars[signature].labor)
        {
            this.labor-=cars[signature].labor;
            return true;
        }
        return false;
        //hi!!
    }


}
