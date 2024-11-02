import java.util.Scanner;

class Ethanol{
    int p,ml,lost;
    Ethanol(int p,int ml){
        this.p = p;
        this.ml = ml;
        this.lost = ml;
    }
    public void used (int used){
        if(used > lost)
        {
            this.lost = 0;
        }
        else
        {
            this.lost = ml - used;
        }
    }
    public void prinInfo(){
        System.out.println("Ethanol " + p + "% (" + lost + "ml./" + ml + "ml.)");
    }
}


public class Ethanol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int ml = sc.nextInt();
        int used= sc.nextInt();
        Ethanol e = new Ethanol(p,ml);
        e.used(used);
        e.prinInfo();
    }
}
