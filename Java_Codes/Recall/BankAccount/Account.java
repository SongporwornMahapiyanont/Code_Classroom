package BankAccount;

class Account{
    String name,code;
    double balance;
    boolean active;
    Account(String name,String code,double money){
        this.name = name;
        this.code = code;
        this.balance = money;
        this.active = true;
        System.out.println("Open account");
    }
    void printInfo(){
        if(this.active) {
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", active");
        }
        else
        {
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", inactive");
        }
    }
    double checkBalance(){
        return this.balance;
    }
    void closeAccount(){
        this.active = false;
        printInfo();
    }
    boolean deposit(double moneyy){
        if(this.active)
        {
            this.balance+=moneyy;
            System.out.print(this.balance + " ");
            return true;
        }
        return false;
    }
    boolean withdrawn(double moneyy){
        if(active && moneyy>=this.balance)
        {
            this.balance-=moneyy;
            System.out.print(this.balance + " ");
            return true;
        }
        return false;
    }
}
