import java.util.Scanner;
class TaoKlingOrder{
    int numMilk,numJuice,numMineralWater,total;
    String phoneNo,code;
    boolean completed = true;
    int totalprice=0;

    TaoKlingOrder(String phoneNo,int n1,int n2,int n3,String code){
        if(n1<=0)
        {
            n1 = 0;
        }
        if(n2 <= 0)
        {
            n2 =0 ;
        }
        if(n3 <=0 )
        {
            n3 = 0;
        }
        if(phoneNo.charAt(0) == '0' && phoneNo.length() == 10)
        {
            this.phoneNo = phoneNo;
        }
        else if(phoneNo.charAt(0) != 0 || phoneNo.length() != 10)
        {
            System.out.println("invalid phone number");
            this.phoneNo = "0#########";
            completed = false;
        }
        this.numMilk = n1;
        this.numJuice = n2;
        this.numMineralWater = n3;
        this.code = code;
        this.totalprice = (numMilk*10) + (numJuice*20) + (numMineralWater*15);

    }

    public boolean grabOrder(String phone,String code1){
        boolean checkp = phoneNo.equals(phone);
        boolean checkc = code.equals(code1); 
        if(checkp && checkc)
        {
            completed = true;
            return true;
        }
        completed = false;
        return false;
    }

    public void printInfo(){
        System.out.print(phoneNo + " ");
        System.out.print(numMilk + " ");
        System.out.print(numJuice + " ");
        System.out.print(numMineralWater + " ");
        System.out.print(totalprice + " ");

        if(completed)
        {
            System.out.print('Y');
        }
        else
        {
            System.out.print('N');
        }
    }
}
public class TaoKling{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String phoneNo = sc.next();
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    String code = sc.next();
    TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1,n2,n3,code);
    String phone = sc.next();
    String code1 = sc.next();
    boolean flag = t.grabOrder(phone,code1);
    System.out.println(flag);
    t.printInfo();
    }
}