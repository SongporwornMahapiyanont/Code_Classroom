package BankAccount;
import java.util.Scanner;

/**
 * BankAccount1
 */
public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account account = new Account(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            String order = scan.next();
            if (order.equals("1")){
                account.printInfo();
            }
            else if(order.equals("2"))
            {
                double value = account.checkBalance();
                System.out.println(value);
            }
            else if(order.equals("3"))
            {
                account.closeAccount();
            }
            else if (order.equals("4"))
            {
                double m = scan.nextDouble();
                System.out.println(account.deposit(m));
            }
            else
            {
                double m = scan.nextDouble();
                System.out.println(account.withdrawn(m));
                
            }
        }
    }
}