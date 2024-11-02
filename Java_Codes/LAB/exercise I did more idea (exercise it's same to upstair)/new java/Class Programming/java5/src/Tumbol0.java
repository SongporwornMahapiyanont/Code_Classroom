import java.util.Scanner;

class Tumbol{
    String name;
    int rainbow;
    int wang;
    int people;
    int availBudget;
    static int total_budget = 0;

    Tumbol(String name, int rainbow, int wang, int people){
        this.name = name;
        this.rainbow = rainbow;
        this.wang = wang;
        this.people = people;

        availBudget = people * 5000;
    }

    void allocateBudget(int[] budget){
        boolean check = false;
        for(int i=0; i<budget.length; i++){
            if(this.availBudget - budget[i] >= 0){
                System.out.print(i+1 + " ");
                this.availBudget -= budget[i];
                total_budget += budget[i];
                check = true;
            }
        }

        if(!check){
            System.out.print("none");
        }
    }

}

public class Tumbol0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //TUMBOL 1
        // String name = scan.nextLine();
        // int rainbow = scan.nextInt();
        // int wang = scan.nextInt();
        // int people = scan.nextInt();
        // int n = scan.nextInt();
        // int[] budget = new int[n];
        // for(int i=0; i<n; i++){
        //     budget[i] = scan.nextInt();
        // }

        // Tumbol tm = new Tumbol(name, rainbow, wang, people);
        // tm.allocateBudget(budget);

        //TUMBOL 2
        int n = scan.nextInt();
        scan.nextLine();
        Tumbol[] tm = new Tumbol[n];
        for(int i=0; i<n; i++){
            String name = scan.nextLine();
            int rainbow = scan.nextInt();
            int wang = scan.nextInt();
            int people = scan.nextInt();
            scan.nextLine();
            tm[i] = new Tumbol(name, rainbow, wang, people);
        }

        for(int i=0; i<n; i++){
            int q = scan.nextInt();
            int[] budget = new int[q];
            for(int j=0; j<q; j++){
                budget[j] = scan.nextInt();
            }
            tm[i].allocateBudget(budget);
            System.out.println();
        }
        System.out.println(tm[0].total_budget);
    }
}
