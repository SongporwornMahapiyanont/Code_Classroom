import java.util.Scanner;
public class CovidScreening {

 static void screenCovid(boolean Insurance,int severity,int age,int vaccines) {
    if(Insurance == true)
    {
        System.out.println("RT-PCR recommended");
    }
    if(age>=70 || severity==3)
    {
        System.out.println("Hospital admission");
    }
    else if(severity <3 && age<70)
    {
        System.out.println("Home isolation");
    }
    if(vaccines<2 || severity>=2)
    {
        System.out.println("Favipiravia included");
    }
    else
    {
        System.out.println("Standard medicine package");
    }
 }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int insurance = scan.nextInt();
    int severity = scan.nextInt();
    int age = scan.nextInt();
    int vaccines = scan.nextInt();

    boolean Insurance = false;
    if(insurance == 1)
    {
        Insurance = true;
    }
    else
    {
        Insurance = false;
    }
    screenCovid(Insurance,severity,age,vaccines);
 }
}