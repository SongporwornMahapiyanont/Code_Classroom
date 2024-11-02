package Fancompany;

class Motor{
    double V,I,eff;
    public Object printInfo;
    Motor(double V,double I, double eff){
        this.V = V;
        this.I = I;
        this.eff = eff/100.0;
    }
    Motor(double I,double eff){
        //call constructor choose from these keywords
        //(super,this,that)
        this(220.0,I,eff);
        // this.V = 220;
        // this.I = I;
        // this.eff = eff/100.0;
    }
    double horsepower(){
        double HP = (V * I * eff)/746;
        return HP;
    }
    void printInfo(){
        double hp = horsepower();
        System.out.println(V + " " + I + " " +eff+" " + String.format("%.2f", hp));
    }
}
