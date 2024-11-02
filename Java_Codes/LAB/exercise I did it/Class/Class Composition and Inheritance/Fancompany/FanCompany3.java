package Fancompany;
import java.util.Scanner;;


public class FanCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size,numb,angle;
        double hp,v,i,eff;

        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan= null;

        for(int index=0;index<n;index++){
            int cmd = sc.nextInt();
            if (cmd==0){
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan = new ElectricFan(ablade, motor);
            }
            else if(cmd==1){
                size = sc.nextInt();    
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                eFan.changeBlade(ablade);
            }
            else if(cmd==2){
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
        sc.close();
    }
}
