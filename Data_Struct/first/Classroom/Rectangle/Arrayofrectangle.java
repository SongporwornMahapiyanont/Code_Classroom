package Rectangle;
import java.util.Scanner;
class Arrayofrectangle {
    int n;
    Rectangle[] Regarr;
    Arrayofrectangle(int n,Scanner scan){
        Regarr = new Rectangle[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("width : ");
            int width = scan.nextInt();
            System.out.print("height : ");
            int height = scan.nextInt();
            Regarr[i] = new Rectangle(width,height); 
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(Regarr[i].toString());
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 'n' = ");
        int n = scan.nextInt();
        Arrayofrectangle A = new Arrayofrectangle(n,scan);    
    }
}