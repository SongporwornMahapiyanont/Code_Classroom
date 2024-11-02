import java.util.Scanner;

class Blade{
    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;

    Blade(int size, int number, int angle, double hp){
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;

        if(size % 2 != 0 || size > 24 || size < 16){
            valid = false;
            System.out.println("invalid size");
        }

        if(number < 3 || number > 5){
            valid = false;
            System.out.println("invalid number of blades");
        }

        if(angle % 3 != 0 || angle > 33 || angle < 27){
            valid = false;
            System.out.println("invalid angle");
        }

        if(hp <= 0){
            valid = false;
            System.out.println("invalid horsepower");
        }
    }

    void printInfo(){
        System.out.println(size + " " + number + " " + angle + " " + hp + " " + valid);
    }

}

class Motor{
    double V;
    double I;
    double eff;

    Motor(double V, double I, double eff){
        this.V = V;
        this.I = I;
        this.eff = eff / 100;
    }

    Motor(double I, double eff){
        V = 220;
        this.I = I;
        this.eff = eff / 100;
    }

    double hoursePower(){
        double hp;
        hp = (V * I * eff) / 746;
        return hp;
    }

    void printInfo(){
        double hp = hoursePower();
        System.out.println(V + " " + I + " " + eff + " " + String.format("%.2f", hp));
    }
}

class ElectricFan{
    int productID;
    Blade blade;
    Motor motor;
    boolean status = false;
    static int count = 0;

    ElectricFan(Blade blade, Motor motor){
        this.blade = blade;
        this.motor = motor;

        count++;
        productID = count;
        if(motor.hoursePower() >= blade.hp){
            status = true;
        }
    }

    boolean changeBlade(Blade blade){
        this.blade = blade;
        if(motor.hoursePower() >= blade.hp){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    boolean changeMotor(Motor motor){
        this.motor = motor;
        if(motor.hoursePower() >= blade.hp){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    void printInfo(){
        System.out.println(productID + " " + blade.size + " " + blade.hp + " " + motor.I + " " + String.format("%.2f", motor.hoursePower()) + " " + status);
    }
}

public class FanCompany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //FanCompany 1
        // int size = scan.nextInt();
        // int number = scan.nextInt();
        // int angle = scan.nextInt();
        // double hp = scan.nextDouble();

        // Blade blade = new Blade(size, number, angle, hp);
        // blade.printInfo();

        //FanCompany 2
        // double v = scan.nextDouble();
        // double i = scan.nextDouble();
        // double eff = scan.nextDouble();

        // Motor motor = new Motor(v, i, eff);
        // motor.printInfo();

        //FanCompany 3
        int n = scan.nextInt();
        int size,numb,angle;
        double hp,v,i,eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan= null;
        for(int j=0; j<n; j++){
            int cmd = scan.nextInt();
            if(cmd == 0){
                size = scan.nextInt();
                numb = scan.nextInt();
                angle = scan.nextInt();
                hp = scan.nextDouble();
                ablade = new Blade(size,numb,angle,hp); 
                v = scan.nextDouble();
                i = scan.nextDouble();
                eff = scan.nextDouble();
                motor = new Motor(v,i,eff);
                eFan = new ElectricFan(ablade, motor);
            }
            else if(cmd == 1){
                size = scan.nextInt();
                numb = scan.nextInt();
                angle = scan.nextInt();
                hp = scan.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                eFan.changeBlade(ablade);
            }
            else if(cmd == 2){
                v = scan.nextDouble();
                i = scan.nextDouble();
                eff = scan.nextDouble();
                motor = new Motor(v,i,eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }      
    }
}
