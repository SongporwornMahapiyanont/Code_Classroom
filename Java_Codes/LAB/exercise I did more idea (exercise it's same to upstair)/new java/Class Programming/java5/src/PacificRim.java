import java.util.ArrayList;
import java.util.Scanner;

class Kaiju{
    String name;
    String damage;
    int height;
    int weight;
    ArrayList<String> power = new ArrayList<>();
    String desc;

    Kaiju(){
        this.name = "Unknown";
        this.damage = "Unknown";
        this.height = -1;
        this.weight = -1;
        this.power.add("-1");
        this.desc = "-1";
    }

    Kaiju(String name){
        this.name = name;
        this.damage = "Unknown";
        this.height = -1;
        this.weight = -1;
        this.power.add("-1");
        this.desc = "-1";
    }

    Kaiju(String name, String damage, int height, int weight, ArrayList<String> power, String desc){
        this.name = name;
        this.damage = damage;
        this.height = height;
        this.weight = weight;
        this.power = power;
        this.desc = desc;
    }

    void PrintDetail(){
        System.out.println("Kaiju : " + name);
        System.out.println("< Category: Category " + damage + " >");

        if(height != -1){
            double height_meters = height / 3.2808;
            System.out.println("Height: " + height + " feet (" + height_meters + " meters)");
        }
        else{
            System.out.println("Height: Unknown");
        }

        if(weight != -1){
            System.out.println("Weight: " + weight + " tons");
        }
        else{
            System.out.println("Weight: Unknown");
        }
        
        if(power.get(0) != "-1"){
            System.out.println("Power: [" + power.size() + "] :" );
            for(int i=0; i<power.size(); i++){
                System.out.println(power.get(i));
            }
            
        }
        else{
            System.out.println("Power: Unknown");
        }
        
        if(desc != "-1"){
            System.out.println("Description: " + desc);
        }
        else{
            System.out.println("Description: Unknown");
        }
        
    }

}

class Jeager{
    String name;
    String country;
    int mark; 
    double height;
    ArrayList<String> pilots = new ArrayList<>();
    ArrayList<String> weapon = new ArrayList<>();

    Jeager(){
        this.name = "Unknown";
        this.country = "Unknown";
        this.mark = -1;
        this.height = -1;
        this.pilots.add("-1");
        this.weapon.add("-1");
    }

    Jeager(String name){
        this.name = name;
        this.country = "Unknown";
        this.mark = -1;
        this.height = -1;
        this.pilots.add("-1");
        this.weapon.add("-1");
    }

    Jeager(String name, String country, int mark, double height, ArrayList<String> pilots, ArrayList<String> weapon){
        this.name = name;
        this.country = country;
        this.mark = mark;
        this.height = height;
        this.pilots = pilots;
        this.weapon = weapon;
    }

    void PrintDetail(){
        System.out.println("Jaegers : " + name);
        System.out.println("< Country of Origin: " + country + " >");
        
        if(mark > 0){
            System.out.println("< Mark: Mark-" + mark + " >");
        }
        else {
            System.out.println("< Mark: Unknown >");
        }

        if(height > 0){
            System.out.println("Height: " + height + " meters");
        }
        else{
            System.out.println("Height: Unknown");
        }

        if(pilots.get(0) != "-1"){
            System.out.println("Pilots: [" + pilots.size() + "] :");
            for(int i=0; i<pilots.size(); i++){
                System.out.println(pilots.get(i));
            }
        }
        else{
            System.out.println("Pilots: Unknown");
        }

        if(weapon.get(0) != "-1"){
            System.out.println("Weapons: [" + weapon.size() + "] :");
            for(int i=0; i<weapon.size(); i++){
                System.out.println(weapon.get(i));
            }
        }
        else{
            System.out.println("Weapons: Unknown");
        }
    }
}

public class PacificRim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Kaiju k = null;
        Jeager j = null;
        int kaiju_type = scan.nextInt();
        if(kaiju_type == 0){
            k = new Kaiju();
        }
        else if(kaiju_type == 1){
            scan.nextLine();
            String name = scan.nextLine();
            k = new Kaiju(name);
        }
        else {
            scan.nextLine();
            String name = scan.nextLine();
            String damage = scan.nextLine();
            int height = scan.nextInt();
            int weight = scan.nextInt();
            scan.nextLine();
            String power = scan.nextLine();
            ArrayList<String> power1 = new ArrayList<>();
            
            int start = 0;
            for(int i=0; i<power.length(); i++){
                if(power.charAt(i) == ','){
                    power1.add(power.substring(start, i));
                    start = i+1;
                }
            }

            if(start != power.length()){
                power1.add(power.substring(start, power.length()));
            }
            
            String desc = scan.nextLine();
            k = new Kaiju(name, damage, height, weight, power1, desc);
        }

        int jeager_type = scan.nextInt();
        if(jeager_type == 0){
            j = new Jeager();
        }
        else if(jeager_type == 1){
            scan.nextLine();
            String name = scan.nextLine();
            j = new Jeager(name);
        }
        else {
            scan.nextLine();
            String name = scan.nextLine();
            String country = scan.nextLine();
            int mark = scan.nextInt();
            double height = scan.nextDouble();
            scan.nextLine();
            String pilot = scan.nextLine();
            ArrayList<String> pilots = new ArrayList<>();
            
            if(pilot.length() == 0){
                pilots.add(" ");
            }
            else{
                int start = 0;
                for(int i=0; i<pilot.length(); i++){
                    if(pilot.charAt(i) == ','){
                        pilots.add(pilot.substring(start, i));
                        start = i+1;
                    }
                }

                if(start != pilot.length()){
                    pilots.add(pilot.substring(start, pilot.length()));
                }
            }

            String weapon = scan.nextLine();
            ArrayList<String> weapons = new ArrayList<>();
            
            if(weapon.length() == 0){
                weapons.add(" ");
            }
            else{
                int start = 0;
                for(int i=0; i<weapon.length(); i++){
                    if(weapon.charAt(i) == ','){
                        weapons.add(weapon.substring(start, i));
                        start = i+1;
                    }
                }
                
                if(start != weapon.length()){
                    weapons.add(weapon.substring(start, weapon.length()));
                }
            }

            j = new Jeager(name, country, mark, height, pilots, weapons);
        }

        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
    }
}