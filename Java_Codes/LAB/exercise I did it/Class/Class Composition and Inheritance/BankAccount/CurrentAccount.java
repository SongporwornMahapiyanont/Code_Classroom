package BankAccount;

class CurrentAccount extends Account{
    double overDraft;
    CurrentAccount(String name, String code, double money,double overDraft){
        super(name, code, money);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + overDraft);
    }    
    @Override boolean withdrawn(double money){
        if(active && this.money-money>= (-1)*overDraft) // carful
        {
            this.money-=money;
            if(this.money>=0)
                System.out.print(this.money + " " );
            else if(this.money<0)
                System.out.print((this.money) + " " + "overdraft ");
            return true;
        }
        else
        {
            return false;
        }
    }
}
