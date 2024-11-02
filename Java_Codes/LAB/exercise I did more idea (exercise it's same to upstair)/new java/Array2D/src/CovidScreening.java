import java.util.Scanner;

public class CovidScreening {
    static void screenCovid(int n, int symptom, int age, int vac){
        if(n == 1){
            System.out.println("RT-PCR recommended");
        }
        if(age >= 70 || symptom > 2){
            System.out.println("Hospital admission");
        }
        else{
            System.out.println("Home isolation");
        }
        if(symptom > 1 || vac < 2){
            System.out.println("Favipiravia included");
        }
        else{
            System.out.println("Standard medicine package");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int symptom = scan.nextInt();
        int age = scan.nextInt();
        int vac = scan.nextInt();
        screenCovid(n, symptom, age, vac);
    }
}
