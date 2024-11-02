import java.util.Scanner;

class Dept{
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int TotalIncome,TotalExpense,ToTal;
    int salary,elec,eduCost;
   

    Dept(int N,int K){
        this.TotalIncome = computeIncome(N, K);
        this.TotalExpense = computeExpense(N, K);
        System.out.println("total income = " + TotalIncome);
        System.out.println("total expense = " + TotalExpense);
        System.out.println("income - expense = " + (TotalIncome-TotalExpense));
    }
    int computeIncome(int N,int K)
    {
        this.ministryBudget = (N*500000) + (K*3000);
        this.eduFee = (K*5000);
        this.serviceFee = 300000;
        this.donation = 100000;
        int result = ministryBudget+eduFee+serviceFee+donation;
        return result;
    }
    int computeExpense(int N,int K)
    {
        this.salary = (N*600000);
        this.elec = (N+K)*2000;
        this.eduCost = K*4000;
        int result  = salary + elec + eduCost;
        return result;
    }
    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = "  + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}



public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Dept d = new Dept(N,K);
        
        d.printReport();
        sc.close();
    }
}
