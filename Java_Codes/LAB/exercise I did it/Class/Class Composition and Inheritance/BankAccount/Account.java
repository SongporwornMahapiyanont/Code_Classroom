package BankAccount;

class Account {
    String name,code;
    double money; //be careful.
    boolean active; // open or not open
    Account(String name, String code, double money){
        this.name = name;
        this.code = code;
        this.money = money;
        this.active = true;
        System.out.println("Open account");
    }
    boolean deposit(double money){
        if(active)
        {
            this.money+=money;
            System.out.print(this.money + " ");
            // System.out.println("true");
            return true;
        }
        // System.out.println("false");
        return false;
    }
    boolean withdrawn(double money){ 
        if(active && money<=this.money)
        {
            this.money-=money;
            System.out.print(this.money+ " ");
            // System.out.println("true");
            return true;   
        }
        // System.out.println("false");
        return false;
    }
    void checkBalance(){
        System.out.println(this.money);
    }
    void closeAccount(){
        if(active)
        {
            this.active = false;
            printlnfo();
            // System.out.println("false");
        }
    }
    void printlnfo(){
        System.out.print(this.name + ", ");
        System.out.print(this.code + ", ");
        System.out.print(this.money + ", ");
        if(active)
        {
            System.out.println("active");
        }
        else if(!active)
        {
            System.out.println("inactive");
        }
    }
}

