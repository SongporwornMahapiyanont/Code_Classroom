import java.util.ArrayList;
import java.util.Scanner;

class Traveler{
    String PassportID;
    String fCountry;
    String carl;
    double temp;
    int status;
    static ArrayList<String> daySelf = new ArrayList<>();
    static ArrayList<String> dayState = new ArrayList<>();
    static ArrayList<String> IDSelf = new ArrayList<>();
    static ArrayList<String> IDState = new ArrayList<>();

    Traveler(String PassportID, String fCountry, String carl, double temp){
        this.PassportID = PassportID;
        this.fCountry = fCountry;
        this.carl = carl;
        this.temp = temp;
    }

    void printInfo(){
        if(temp > 37.5 || fCountry.equals("JAPAN") || fCountry.equals("GERMANY")  || fCountry.equals("KOREA") || fCountry.equals("CHINA") || fCountry.equals("TAIWAN")  || fCountry.equals("FRANCE") || fCountry.equals("SINGAPORE") || fCountry.equals("ITALY")  || fCountry.equals("IRAN")){
            //System.out.println(" STATE-QUARANTINE");
            dayState.add(carl);
            IDState.add(PassportID);
        } 
        else {
            //System.out.println(" SELF-QUARANTINE");
            daySelf.add(carl);
            IDSelf.add(PassportID);
        }
    }

    void PrintDetail(){
        System.out.println(dayState.size());
        if(dayState.size() != 0){
            for(int i=0; i<dayState.size(); i++){
                System.out.println(IDState.get(i) + " " + dayState.get(i));
            }
        }
        
        
        System.out.println(daySelf.size());
        if(daySelf.size() != 0){
            for(int i=0; i<daySelf.size(); i++){
                System.out.println(IDSelf.get(i) + " " + daySelf.get(i));
            }
        }
    }
}

public class TravelerScreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Traveler trv = null;
        scan.nextLine();
        for(int i=0; i<n; i++){
            String PassportID = scan.next();
            String fCountry = scan.next();
            String carl = scan.next();
            double temp = scan.nextDouble();

            trv = new Traveler(PassportID, fCountry, carl, temp);
            trv.printInfo();
        }

        trv.PrintDetail();
    }
}
