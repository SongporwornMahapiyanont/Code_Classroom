import java.util.ArrayList;
import java.util.Scanner;

class Runner{
    String name;
    static ArrayList<String> BIB = new ArrayList<>();
    int static_variable;
    static int count = 1;

    Runner(String name, int type){
        this.name = name;

        if(type == 1){
            BIB.add("A" + String.format("%03d", count));
            count++;
        }
        else if(type == 2){
            BIB.add("B" + String.format("%03d", count));
            count++;
        }
        else if(type == 3){
            BIB.add("C" + String.format("%03d", count));
            count++;
        }
        else if(type == 4){
            BIB.add("D" + String.format("%03d", count));
            count++;
        }
    }

    void printInfo(){
        int fun = 0;
        int mini = 0;
        int half = 0;
        int marathon = 0;
        ArrayList<String> fun_bib = new ArrayList<>();
        ArrayList<String> mini_bib = new ArrayList<>();
        ArrayList<String> half_bib = new ArrayList<>();
        ArrayList<String> marathon_bib = new ArrayList<>();
        for(int i=0; i<BIB.size(); i++){
            if(BIB.get(i).charAt(0) == 'A'){
                fun_bib.add(BIB.get(i));
                fun++;
            }
            else if(BIB.get(i).charAt(0) == 'B'){
                mini_bib.add(BIB.get(i));
                mini++;
            }
            else if(BIB.get(i).charAt(0) == 'C'){
                half_bib.add(BIB.get(i));
                half++;
            }
            else if(BIB.get(i).charAt(0) == 'D'){
                marathon_bib.add(BIB.get(i));
                marathon++;
            }
        }

        System.out.println(fun);
        if(fun > 0){
            for(int i=0; i<fun; i++){
                System.out.print(fun_bib.get(i) + " ");
            }
        }
        else {
            System.out.print("-");
        }
        
        System.out.println("\n" + mini);
        if(mini > 0){
            for(int i=0; i<mini; i++){
                System.out.print(mini_bib.get(i) + " ");
            }
        }
        else {
            System.out.print("-");
        }
        
        System.out.println("\n" + half);
        if(half > 0){
            for(int i=0; i<half; i++){
                System.out.print(half_bib.get(i) + " ");
            }
        }
        else {
            System.out.print("-");
        }
        
        System.out.println("\n" + marathon);
        if(marathon > 0){
            for(int i=0; i<marathon; i++){
                System.out.print(marathon_bib.get(i) + " ");
            }
        }
        else {
            System.out.print("-");
        }
    }
}

public class Marathon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<n; i++){
            String name = scan.next();
            int type = scan.nextInt();
            scan.nextLine();

            if(type >= 1 && type <=4){
                Runner run = new Runner(name, type);
            }
        }

        Runner run = new Runner("test", 0);
        run.printInfo();
    }
}
