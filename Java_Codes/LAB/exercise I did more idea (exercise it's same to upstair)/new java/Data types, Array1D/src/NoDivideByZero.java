import java.util.Scanner;

public class NoDivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        Double z = scan.nextDouble();

        double result = (x+y)/z;

        if(z==0){
            System.out.println("cannot divide by zero");
        }
        else {
            System.out.printf("%.6f\n",result);
            //System.out.println(String.format("%.6f",sum/z));
        }
        scan.close();
    }
}
