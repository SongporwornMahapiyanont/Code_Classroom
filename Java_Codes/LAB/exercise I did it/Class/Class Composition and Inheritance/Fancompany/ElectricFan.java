package Fancompany;

class ElectricFan {
    int cmd;
    Blade blade; 
    Motor motor;
    boolean status;
    static int count=0;
    ElectricFan(Blade blade, Motor motor){
        count+=1;
        this.blade = blade;
        this.motor = motor;
        this.cmd = count;
        if(motor.horsepower() >= blade.hp)
        {
            this.status = true;
        }
        else
        {
            this.status = false;
        }
    }    
    boolean changeBlade(Blade blade){
        // this.blade.size = blade.size;
        // this.blade.number = blade.number;
        // this.blade.angle = blade.angle;
        // this.blade.hp = blade.hp;
        this.blade = blade;
        if(motor.horsepower() >= blade.hp)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
    boolean changeMotor(Motor motor){
        // this.motor.V = motor.V;
        // this.motor.I = motor.I;
        // this.motor.eff = motor.eff;
        this.motor = motor;
        if(motor.horsepower() >= blade.hp)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
    void printInfo(){
        System.out.print(cmd +" " + blade.size + " " + blade.hp + " " + motor.I + " ");
        System.out.printf("%.2f",motor.horsepower());
        System.out.print(" ");
        System.out.println(status);
    }
}
