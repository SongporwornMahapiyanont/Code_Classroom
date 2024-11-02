import java.util.Scanner;
class HumanCharacters {
    String name;
    String age;
    boolean weather;
    String abilities;
    String personality;
    String background;

    HumanCharacters(String name, String age, boolean weather, String abilities, String personality, String background){
        this.name = name;
        this.age = age;
        this.weather = weather;
        this.abilities = abilities;
        this.personality = personality;
        this.background = background;
    }
}
class GodCharacters {
    String name;
    String legend;
    String abilities;
    String personality;
    String background;

    GodCharacters(Scanner scan){
        String tmp = scan.nextLine();
        int target = tmp.indexOf("(");
        this.name = tmp.substring(0, target);
        this.legend = tmp.substring(target+1, tmp.length() - 1);
        this.abilities = scan.nextLine();
        this.personality = scan.nextLine();
        this.background = scan.nextLine();
    }
}

public class RecordofRagnarok {
    private static void battleROR(HumanCharacters human, GodCharacters god, int round){
        System.out.println("<>---------- Record of Ragnarok ----------<>");
        System.out.println("<< { --------- ROUND ( " + round + " ) --------- } >>");
        System.out.println("<<==== GOD ====>>");
        System.out.println("Name : " + god.name );
        System.out.println("Legend : [ " + god.legend + " ]");
        System.out.println("- Abilities: " + god.abilities );
        System.out.println("- Personality: " + god.personality );
        System.out.println("- Background: " + god.background );
        System.out.println("VS");
        System.out.println("<<==== HUMAN ====>>");
        System.out.println("Name : " + human.name );
        System.out.print("Age : " + human.age );
        if(human.weather){
            System.out.println(" at death");
        }
        else{
            System.out.println("");
        }
        System.out.println("- Abilities: " + human.abilities );
        System.out.println("- Personality: " + human.personality );
        System.out.println("- Background: " + human.background );
        System.out.println("<< { --------- ROUND ( " + round + " ) --------- } >>");
        System.out.println("<>---------- Record of Ragnarok ----------<>");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String t = sc.nextLine();
        HumanCharacters[] human = new HumanCharacters[n];
        GodCharacters[] god = new GodCharacters[n];
        for(int i=0; i<n; i++){
            String Age = null;
            boolean Death = false;
            String tmp1[] = sc.nextLine().split("Age: ");
            String Name = tmp1[0].substring(0, tmp1[0].length() - 2);
            if (tmp1[1].indexOf(" at death") > 0) {
                Death = true;
                Age = tmp1[1].substring(0, 2);
            } else if (tmp1[1].indexOf("Unknown") >= 0) {
                Age = "Unknown";
            } else {
                Age = tmp1[1].substring(0, 2);
            }
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();

            human[i] = new HumanCharacters(Name, Age, Death, Abilities, Personality, Background);
        }

        for(int i=0; i<n; i++){
            god[i] = new GodCharacters(sc);
        }

        int count = 1;
        for(;;){
            int h = sc.nextInt();
            int g = sc.nextInt();
            boolean booH = true;
            boolean booG = true;

            if(h < 0 || h >= n){
                booH = false;
            }
            if(g < 0 || g >= n){
                booG = false;
            }
            if (booH == true && booG == true) {
                battleROR(human[h], god[g], count);
                count++;
            } else {
                break;
            }

        }
    }
}
