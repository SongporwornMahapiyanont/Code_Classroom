import java.util.Scanner;

class CookiePlanner{
    int flour_use;
    int butter_use;
    int flour;
    int butter;
    int bags;

    CookiePlanner(int flour_use, int butter_use){
        this.flour_use = flour_use;
        this.butter_use = butter_use;
    }

    int calculate(){
        int flour_enough = flour / flour_use;
        int butter_enough = butter / butter_use;
        int min = flour_enough;
        if(butter_enough < min){
            min = butter_enough;
        }

        return min;
    }

    boolean produce(int want){
        int flour_enough = want * flour_use;
        int butter_enough = want * butter_use;
        if(flour - flour_enough >= 0 && butter - butter_enough >= 0){
            flour -= want*flour_use;
            butter -= want*butter_use;
            bags+=want;
            System.out.print(bags + " ");
            return true;
        }
        else{
            int c = calculate();
            System.out.print("Max capacity = " + c + " bags, but " + want + " bags requested ");
            return false;
        }
    }

    boolean addFlour(int flour){
        if(flour < 1){
            System.out.print("Invalid flour quantity ");
            return false;
        }
        else{
            this.flour += flour;
            System.out.print(this.flour + " ");
            return true;
        }
    }

    boolean addButter(int butter){
        if(butter < 1){
            System.out.print("Invalid butter quantity ");
            return false;
        }
        else{
            this.butter += butter;
            System.out.print(this.butter + " ");
            return true;
        }
    }

    void reportProduction(){
        System.out.println("Cookie bags: " + bags);
        System.out.println("Flour left: " + flour);
        System.out.println("Butter left: " + butter);
    }

}

public class CookiePlan {

    static int planCookie(int[] flour, int[] butter){
        int count = 0;
        for(int i=0; i<flour.length; i++){
            if(flour[i] / 6  < 10 || butter[i] / 3 < 10 ){
                System.out.println(i+1);
                count++;
            }
        }
        return count;
    }

    //COOKIE PLAN
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);

    //     int n = scan.nextInt();
    //     int[] flour = new int[n];
    //     int[] butter = new int[n];

    //     for(int i=0; i<n; i++){
    //         flour[i] = scan.nextInt();
    //         butter[i] = scan.nextInt();
    //     }

    //     int p = planCookie(flour, butter);
    //     System.out.println("There are " + p + " days that ingredients are insufficient");
    // }


    //COOKIE FACTORY
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int b = scan.nextInt();
        CookiePlanner ck = new CookiePlanner(b, f);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int k = scan.nextInt();
            int a = scan.nextInt();

            if(k == 1){
                System.out.println(ck.addFlour(a));
            }
            else if(k == 2){
                System.out.println(ck.addButter(a));
            }
            else{
                System.out.println(ck.produce(a));
            }

        }

        ck.reportProduction();
    }
}
