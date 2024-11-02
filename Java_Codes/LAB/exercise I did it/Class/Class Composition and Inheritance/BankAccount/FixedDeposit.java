package BankAccount;

class FixedDeposit extends Account{
    double fixedAmount; // money >= fixedAmount
    FixedDeposit(String name, String code, double money,double fixedAmount){
        super(name, code, money);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + fixedAmount);
    }
    @Override boolean deposit(double money){
        if(active && money>=fixedAmount)
        {
            this.money+=money;
            System.out.print(this.money + " ");
            return true;
        }
        else
        {
            if(!active)
            {
                return false;
            }
            System.out.print("deposit less than " + fixedAmount + " ");
            return false;
        }
        
    }
}
