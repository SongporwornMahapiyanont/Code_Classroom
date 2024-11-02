package BankAccount;


class Saving {
    String id, tel;
    boolean promptPay;
    Saving(String id, String tel, boolean promptPay){
        this.id = id;
        this.tel = tel;
        this.promptPay = false;
        System.out.println("Saving account");
    }
    void printInfo(){
        if(this.promptPay)
        {
            System.out.println();
        }
        else{

        }
    }
}
