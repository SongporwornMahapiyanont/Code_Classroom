import java.util.Scanner;

class Dept{
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;


    Dept(int N,int K){
        computeIncome(N, K);
    }
    void computeIncome(int N,int K)
    {
        this.ministryBudget = (N*500000) + (K*3000);
        this.eduFee = (K*5000);
        this.serviceFee = 300000;
        this.donation = 100000;
    }
    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = "  + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);

    }
}



public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Dept d = new Dept(N,K);
        d.printReport();
        sc.close();
    }
}
