package BankAccount;

class Saving extends Account{
    String id,number;
    boolean promptPay;
    Saving(String name, String code, double money) {
        super(name, code, money);
        this.promptPay = false;
        System.out.println("Saving account");
    }
    boolean openPromptPay(int order,String idOrnumber){
        if(order == 1)
        {
            if(idOrnumber.length()==13)
            {
                this.id = idOrnumber;
                this.promptPay = true;
            }
            else
            {
                return false;
            }
        }
        else if(order == 2)
        {
            if(idOrnumber.length()==10)
            {
                this.number = idOrnumber;
                this.promptPay = true;
            }
            else
            {
                return false;
            }
        }
        return promptPay;
    }
    @Override void printlnfo(){
        super.printlnfo();  
        if(this.promptPay)
        {
            System.out.print("PromptPay");
            if(this.id!=null ) // == it will compare Pointer(address)  but .equal it will compare String or word
            {
                System.out.print(", " + this.id);
            }
            if(this.number!=null)
            {
                System.out.print(", " + this.number);
            }
        }
        else
        {
            System.out.print("no PromptPay");
        }
        System.out.println();
    }
}
