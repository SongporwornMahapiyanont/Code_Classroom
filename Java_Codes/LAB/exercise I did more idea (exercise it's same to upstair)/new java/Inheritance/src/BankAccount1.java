import java.util.Scanner;

class Account{
    String name;
    String code;
    double balance;
    boolean active;
    
    Account(String name, String code, double balance){
        this.name = name;
        this.code = code;
        this.balance = balance;

        active = true;
        System.out.println("Open account");
    }

    void printInfo(){
        System.out.print(name + ", " + code + ", " + balance + ", ");
        if(active){
            System.out.println("active");
        }
        else {
            System.out.println("inactive");
        }
    }

    double checkBalance(){
        return this.balance;
    }

    void closeAccount(){
        active = false;
        printInfo();
    }

    boolean deposit(double money){
        if(active){
            balance += money;
            System.out.print(balance + " ");
            return true;
        }
        else {
            return false;
        }
    }

    boolean withdrawn(double money){
        if(active && balance - money >= 0){
            balance -= money;
            System.out.print(balance + " ");
            return true;
        }
        else {
            return false;
        }
    }
}

class Saving extends Account{
    String id;
    String tel;
    boolean promptPay;

    Saving(String name, String code, double balance){
        super(name, code, balance);
        promptPay = false;
        System.out.println("Saving account");
    }

    @Override void printInfo() {
        super.printInfo();
        if(promptPay){
            System.out.print("PromptPay");
            if(id != null){
                System.out.print(", " + id);
            }
            if(tel != null){
                System.out.print(", " + tel);
            }
        }
        else {
            System.out.print("no PromptPay");
        }
        System.out.println();
    }

    boolean openPromptPay(int type, String idORtel){
        if(type == 1 && idORtel.length() == 13){
            id = idORtel;
            promptPay = true;
        }
        else if(type == 2 && idORtel.length() == 10){
            tel = idORtel;
            promptPay = true;
        }
        else {
            return false;
        }
        return promptPay;
    }
}

class FixedDeposit extends Account{
    double fixedAmount;
    FixedDeposit(String name, String code, double balance, double fixedAmount){
        super(name, code, balance);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + fixedAmount);
    }

    @Override
    boolean deposit(double money) {
        if(active && money >= fixedAmount){
            balance += money;
            System.out.print(balance + " ");
            return true;
        }
        else {
            if(!active){
                return false;
            }
            System.out.print("deposit less than " + fixedAmount + " ");
            return false;
        }
    }
}

class CurrenAccount extends Account{
    double overDraft;
    CurrenAccount(String name, String code, double balance, double overDraft){
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + overDraft);
    }

    @Override
    boolean withdrawn(double money) {
        if(active && balance - money >= overDraft*-1.0){
            balance -= money;
            System.out.print(balance + " ");
            if(balance < 0){
                System.out.print("overdraft ");
            }
            return true;
        }
        else {
            return false;
        }
    }
}

public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrenAccount cAcc = null;
        for(int i=0; i<3; i++){
            String name = scan.nextLine();
            String code = scan.next();
            double balance = scan.nextDouble();
            if(i == 0){
                sAcc = new Saving(name, code, balance);
            }
            else if(i == 1){
                double fixedAmount = scan.nextDouble();
                fAcc = new FixedDeposit(name, code, balance, fixedAmount);
            }
            else {
                double overDraft = scan.nextDouble();
                cAcc = new CurrenAccount(name, code, balance, overDraft);
            }
            scan.nextLine();
        }
        
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int who = scan.nextInt();
            int order = scan.nextInt();
            if(order == 1){
                switch (who) {
                    case 1:
                        sAcc.printInfo();
                        break;
                    case 2:
                        fAcc.printInfo();
                        break;
                    case 3:
                        cAcc.printInfo();
                        break;
                }
            }
            else if(order == 2){
                switch (who) {
                    case 1:
                        System.out.println(sAcc.checkBalance());
                        break;
                    case 2:
                        System.out.println(fAcc.checkBalance());
                        break;
                    case 3:
                        System.out.println(cAcc.checkBalance());
                        break;
                }
            }
            else if(order == 3){
                switch (who) {
                    case 1:
                        sAcc.closeAccount();
                        break;
                    case 2:
                        fAcc.closeAccount();
                        break;
                    case 3:
                        cAcc.closeAccount();
                        break;
                }
            }
            else if(order == 4){
                double money = scan.nextDouble();
                switch (who) {
                    case 1:
                        System.out.println(sAcc.deposit(money));
                        break;
                    case 2:
                        System.out.println(fAcc.deposit(money));
                        break;
                    case 3:
                        System.out.println(cAcc.deposit(money));
                        break;
                }
            }
            else if(order == 5){
                double money = scan.nextDouble();
                switch (who) {
                    case 1:
                        System.out.println(sAcc.withdrawn(money));
                        break;
                    case 2:
                        System.out.println(fAcc.withdrawn(money));
                        break;
                    case 3:
                        System.out.println(cAcc.withdrawn(money));
                        break;
                }
            }
            // else {
            //     int subMenu = scan.nextInt();
            //     String number = scan.next();
            //     System.out.println(ac1.openPromptPay(subMenu, number));
            // }
        }
    }
}
