import java.util.Scanner;

class Ethanol{
    int concentration;
    int ml; 
    int al;
    int ethanol_left;

    Ethanol(int concentration, int ml, int al){
        this.concentration = concentration;
        this.ml = ml;
        this.al = al;
        ethanol_left = ml;
    }

    void used(int have){
        int use = ml - al;
        if(have >= use){
            ethanol_left = use;
        }
        else {
            ethanol_left = have;
        }
    }

    void printInfo(){
        System.out.print(":" + ethanol_left + " ");
    }
}

public class Ethanol1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ethanol 1
        // int con = scan.nextInt();
        // int have = scan.nextInt();
        // int use = scan.nextInt();

        // Ethanol eth = new Ethanol(con, have);

        // eth.used(use);
        // eth.printInfo();

        // Ethanol 2
        int n = scan.nextInt();
        Ethanol[] eth = new Ethanol[n];
        for(int i=0; i<n; i++){
            int con = scan.nextInt();
            int have = scan.nextInt();
            int use = scan.nextInt();

            eth[i] = new Ethanol(con, have, use);
        }

        int first = scan.nextInt();
        int last = scan.nextInt();

        for(int i=0; i<n; i++){
            if(eth[i].concentration == 75){
                eth[i].used(first);
                first-=eth[i].ethanol_left;
                if(first < 0){
                    first = 0;
                }
            }
            else {
                eth[i].used(last);
                last-=eth[i].ethanol_left;
                if(last < 0){
                    last = 0;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(eth[i].concentration == 75){
                System.out.print(i+1);
                eth[i].printInfo();
            }
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if(eth[i].concentration == 95){
                System.out.print(i+1);
                eth[i].printInfo();
            }
        }
    }
}
