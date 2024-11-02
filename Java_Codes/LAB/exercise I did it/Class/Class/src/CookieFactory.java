import java.util.Scanner;
class CookiePlanner {
    final int F;
    final int B;
    int flour=0,butter=0,bags=0;
    int resultFlour;
    int resultButter;

    CookiePlanner(final int F ,final int B){
        this.F = F;
        this.B = B;
    }

    int calculate(){ 
        this.resultFlour = flour/F;
        this.resultButter = butter/B;
        if(resultButter < resultFlour)
        {
            return resultButter;
        }  
        return resultFlour;
    }

    
    boolean addFlour(int A){ //K==1
        if(A<=0)
        {
            System.out.print("Invalid flour quantity ");
            return false;
        }
        flour+=A;
        System.out.print(flour + " ");
        return true;
    }
    
    boolean addButter(int A) //K=2
    {
        if(A<=0)
        {
            System.out.print("Invalid butter quantity ");
            return false;
        }
        butter+=A;
        System.out.print(butter + " ");
        return true;
    }

    boolean produce(int A){ //k=3
        int wantflour = A*F; 
        int wantButter = A*B;
        if(flour<wantflour || butter < wantButter)
        {
            int C = calculate();
            System.out.print("Max capacity = " + C +  " bags, but " +  A  + " bags requested ");
            return false;
        } 
        flour-=wantflour;
        butter-=wantButter;
        this.bags+=A;
        System.out.print(bags + " ");
        return true;
        
    }

    void reportProduction(){ //print
        System.out.println("Cookie bags: " + bags);
        System.out.println("Flour left: " + flour);
        System.out.println("Butter left: " + butter);
    }

}
public class CookieFactory {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int F = scan.nextInt();
        final int B = scan.nextInt();
        CookiePlanner planner = new CookiePlanner(F, B);

        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if(K==1)
            {
                System.out.println(planner.addFlour(A));
            }
            else if(K==2)
            {
                System.out.println(planner.addButter(A));
            }
            else if(K==3)
            {

                System.out.println(planner.produce(A));
            }
        }
        planner.reportProduction();
    }
}