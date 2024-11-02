import java.util.ArrayList;
import java.util.Scanner;

class Demons {
    private String name;
    private int Hp;
    private String Background;
    public Demons(String name, int Hp, String Background) {
        this.name = name;
        this.Hp = Hp;
        this.Background = Background;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return Hp;
    }
    public String getBackground() {
        return Background;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
}
   
class Muzan extends Demons{
    private String alias;
    private String gender;
    private int muzansBlood;
    public int power;

    Muzan(String name, int[] hp, String background, int x){
        super(name, hp[x] / 2, background);
        muzansBlood = hp[x] / 2;
        power = (muzansBlood + getHp()) * 50;
        switch (x) {
            case 0:
                alias = "Child";
                gender = "Male";
                break;
            case 1:
                alias = "Geisha";
                gender = "Female";
                break;
            case 2:
                alias = "The King of Demons";
                gender = "Male";
                break; 
        }
    }

    Muzan(String name){
        super(name, 0, "Unknown");
    }

    int Blood(){
        int blood = muzansBlood*10/100;
        if(muzansBlood - blood >= 0){
            muzansBlood -= blood;
            return blood;
        }
        return 0;
    }

    void printInfo(){
        power = (muzansBlood + getHp()) * 50;
        System.out.println(getName() + " ( " + alias + " )");
        System.out.println("Gender : " + gender);
        System.out.println("HP : " + getHp());
        System.out.println("Blood : " + muzansBlood);
        System.out.println("Power : " + power);
        System.out.println("Background : " + getBackground());
    }
}

class DemonMoons_UpperRanks extends Muzan{
    public int rank;
    DemonMoons_UpperRanks(String name, int rank, int blood){
        super(name);
        this.rank = rank;
        power = rank * blood * 50;
        setHp(rank * blood * 75);
    }

    void Blood(int blood){
        power += blood * 50;
        setHp(getHp() + (blood * 75));
    }

    @Override
    void printInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Upper Rank : " + rank);
        System.out.println("Power : " + power);
        System.out.println("HP : " + getHp());
        System.out.println("Background : Unknown");
    }

}

class DemonMoons_LowerRanks extends Muzan{
    public int rank;
    DemonMoons_LowerRanks(String name, int rank, int blood){
        super(name);
        this.rank = rank;
        power = rank * blood * 25;
        setHp(rank * blood * 50);
    }
    
    void Blood(int blood){
        power += blood * 25;
        setHp(getHp() + (blood * 50));
    }

    @Override
    void printInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Lower Ranks : " + rank);
        System.out.println("Power : " + power);
        System.out.println("HP : " + getHp());
        System.out.println("Background : Unknown");
    }
    
}
public class TwelveDemonMoons {
    private static ArrayList<Muzan> DemonMoons = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int hp[] = new int[3];
        for(int i=0;i<3;i++){
            hp[i] = sc.nextInt();
        }
        String t = sc.nextLine();
        String bg = sc.nextLine();
        int type = sc.nextInt();
        Muzan muzun = new Muzan(name, hp, bg, type);
        for (;;) {
            int type_demon = sc.nextInt();
            if (type_demon == 0) {
                break;
            } else if (type_demon > 0) {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan upper = new DemonMoons_UpperRanks(n, rank, blood);
                DemonMoons.add(upper);
            } else {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan lower = new DemonMoons_LowerRanks(n, rank, blood);
                DemonMoons.add(lower);
            }
        }
        int com = sc.nextInt();
        for (int i = 0; i < com; i++) {
            int id = sc.nextInt() - 1;
            int blood = muzun.Blood();
            if (DemonMoons.get(id) instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) DemonMoons.get(id);
                up.Blood(blood);
                DemonMoons.set(id, up);
            } else if (DemonMoons.get(id) instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) DemonMoons.get(id);
                low.Blood(blood);
                DemonMoons.set(id, low);
            }
        }
        muzun.printInfo();
        for (Muzan x : DemonMoons) {
            if (x instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) x;
                up.printInfo();
            } else if (x instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) x;
                low.printInfo();
            }
        }
    }
}
