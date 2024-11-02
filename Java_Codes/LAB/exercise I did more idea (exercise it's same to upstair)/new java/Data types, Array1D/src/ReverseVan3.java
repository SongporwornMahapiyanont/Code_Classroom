import java.util.Scanner;

public class ReverseVan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A=0,B=0,C=0;
        int round = scan.nextInt();
        for(int i=0; i<round; i++){
            int x = scan.nextInt();
            if(A<=B&&A<=C){
                A+=x;
                System.out.println("A");
            }
            else if(B<=C&&B<=A){
                B+=x;
                System.out.println("B");
            }
            else {
                C+=x;
                System.out.println("C");
            }


            //System.out.println("A: "+ A + " B: " + B + " C: " + C);
        }
        scan.close();
    }
}
