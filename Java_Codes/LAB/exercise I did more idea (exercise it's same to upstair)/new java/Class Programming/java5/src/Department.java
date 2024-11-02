import java.util.Scanner;

class Dept{
    int teacher;
    int student;
    int ministry;
    int education;
    int service = 300000;
    int donation = 100000;
    int total_income;
    int total_expense;
    int salary;
    int elec;
    int eduCost;


    Dept(int teacher, int student){
        this.teacher = teacher;
        this.student = student;

        computeIncome(teacher, student);
        computeExpense(teacher, student);

        System.out.println("total income = " + total_income);
        System.out.println("total expense = " + total_expense);
        System.out.println("income - expense = " + (total_income - total_expense));

        printReport();
    }

    int computeIncome(int teacher, int student){
        ministry = (teacher * 500000) + (student * 3000);
        education = student * 5000;
        this.total_income = ministry + education + service + donation;
        return this.total_income;

    }

    int computeExpense(int teacher, int student){
        salary = teacher * 600000; 
        elec = (teacher + student) * 2000;
        eduCost = student * 4000;
        this.total_expense = salary + elec + eduCost;
        return this.total_expense;
    }

    void printReport(){
        System.out.println("ministry budget = " + ministry);
        System.out.println("education fee = " + education);
        System.out.println("service fee = " + service);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }

}

public class Department {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        Dept dp = new Dept(n, k);
    }
}
