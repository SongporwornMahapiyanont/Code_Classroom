package BankAccount;

import java.util.Scanner;

public class BankAccount3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (t == 1) 
            {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } 
            else if (t == 2) 
            {
                double money2 = scan.nextDouble();
                scan.nextLine(); //Skip the remainder of the double line.
                fAcc = new FixedDeposit(name, code, money1, money2);
            } 
            else if (t == 3) 
            {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line.
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) 
        {
            double amount;
            int type = scan.nextInt();
            int menu = scan.nextInt();
            switch(menu) {
            case 1 -> {
                if(type == 1)
                {
                    sAcc.printlnfo();
                }
                else if(type == 2)
                {
                    fAcc.printlnfo();
                }
                else if(type == 3)
                {
                    cAcc.printlnfo();
                }
                break;
            }
            case 2 ->{
                if(type == 1)
                {
                    sAcc.checkBalance();
                }
                else if(type == 2)
                {
                    fAcc.checkBalance();
                }
                else if(type == 3)
                {
                    cAcc.checkBalance();
                }
                break;
            }
            case 3 ->{
                if(type == 1)
                {
                    sAcc.closeAccount();
                }
                else if(type == 2)
                {
                    fAcc.closeAccount();
                }
                else if(type == 3)
                {
                    cAcc.closeAccount();
                }
                break;
            }
            case 4 ->{
                amount = scan.nextDouble();
                if(type == 1)
                {
                    System.out.println(sAcc.deposit(amount));
                }
                else if(type == 2)
                {
                    System.out.println(fAcc.deposit(amount));
                }
                else if(type == 3)
                {
                    System.out.println(cAcc.deposit(amount));
                }
                break;
            }
            case 5 -> {
                amount = scan.nextDouble();
                if(type == 1)
                {
                    System.out.println(sAcc.withdrawn(amount));
                }
                else if(type == 2)
                {
                    System.out.println(fAcc.withdrawn(amount));
                }
                else if(type == 3)
                {
                    System.out.println(cAcc.withdrawn(amount));
                }
                break;
            }
        }
        }
        scan.close();
    }
}
