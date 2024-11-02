import java.util.Scanner;

public class OddVsEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = 0, even = 0;;
        for(int i=0; i<8; i++){
            int num = scan.nextInt();
            if(num%2==0){
                even+=num;
            }
            else{
                odd+=num;
            }
        }

        if(odd>even){
            System.out.println("odd");
        }
        else if(odd<even){
            System.out.println("even");
        }
        else{
            System.out.println("equal");
        }

        System.out.println(even);
        System.out.println(odd);
        scan.close();
    }
}
