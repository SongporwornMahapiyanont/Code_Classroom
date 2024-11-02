import java.util.Scanner;

class TaoKlingOrder{
    int numMilk;
    int numJuice;
    int numMineralWater;
    int total;
    String phoneNo;
    String code;
    boolean completed;

    TaoKlingOrder(int numMilk, int numJuice, int numMineralWater, String phoneNo, String code){
        this.numMilk = numMilk;
        this.numJuice = numJuice;
        this.numMineralWater = numMineralWater;

        if(phoneNo.length() == 10 && phoneNo.charAt(0) == '0'){
            this.phoneNo = phoneNo;
        }
        else{
            System.out.println("invalid phone number");
            this.phoneNo = "0#########";
            completed = false;
        }
        
        this.code = code;

        total = (numMilk * 10) + (numJuice * 20) + (numMineralWater * 15);
    }

    boolean grabOrder(String phoneNo, String code){
        if(this.phoneNo.equals(phoneNo) && this.code.equals(code)){
            completed = true;
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo(){
        System.out.print(phoneNo + " " + numMilk + " " + numJuice + " " + numMineralWater + " " + total + " ");
        if(completed){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    }
}

public class TaoKling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String phoneNo = scan.next();
        int milk = scan.nextInt();
        int juice = scan.nextInt();
        int minera = scan.nextInt();
        String code = scan.next();

        TaoKlingOrder to = new TaoKlingOrder(milk, juice, minera, phoneNo, code);

        String phone = scan.next();
        String code1 = scan.next();
        System.out.println(to.grabOrder(phone, code1));
        to.printInfo();
    }
}
