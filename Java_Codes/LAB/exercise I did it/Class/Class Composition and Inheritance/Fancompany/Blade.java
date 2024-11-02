package Fancompany;
class Blade{
    int size, number, angle;
    double hp;
    boolean valid = false;
    Blade(int size,int number,int angle,double hp)
    {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
    }
    void printInfo(){
        boolean check = true;
        if(size <16 || size>24 || size%2!=0)
        {
            check = false;
            System.out.println("invalid size");
        }
        if(number !=3 && number!=4 && number!=5)
        {
            check = false;
            System.out.println("invalid number of blades");
        }
        if(angle != 27 && angle != 30 && angle != 33)
        {
            check = false;
            System.out.println("invalid angle");
        }
        if(hp<=0)
        {
            check = false;
            System.out.println("invalid horsepower");
        }
        System.out.print(size + " " + number + " " + angle + " " + hp + " ");
        System.out.println(check);
    }
}