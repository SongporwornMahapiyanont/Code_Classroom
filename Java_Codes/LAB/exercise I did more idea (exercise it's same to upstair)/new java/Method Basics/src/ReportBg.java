import java.util.Scanner;

public class ReportBg {
    static void reportBg(String name, int born, int year){
        if(name.length()<2){
            name = "INVALID";
        }
        System.out.println("Name: " + name);
        
        System.out.print("Birth year: ");
        if(born >= 1900 && born <= 2022 ){
            System.out.println(born);
            if(year - born >= 18 && year >= 1900 && year <= 2022){
                System.out.println("Start year: " + year);
            }
            else{
                System.out.println("Start year: INVALID");
            }
        }
        else{
            System.out.println("INVALID");
            System.out.println("Start year: INVALID");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int birth = scan.nextInt();
        int start_work = scan.nextInt();

        reportBg(name, birth, start_work);
    }
}
