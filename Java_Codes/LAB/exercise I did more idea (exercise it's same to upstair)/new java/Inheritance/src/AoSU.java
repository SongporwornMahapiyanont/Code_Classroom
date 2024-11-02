import java.util.Scanner;

class Hero{
    String name;
    int hp;
    int type_power;
    int power;
    int def_phy;
    int def_magic;
    int type;

    Hero(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        this.name = name;
        this.hp = hp;
        this.type_power = type_power;
        this.power = power;
        this.def_phy = def_phy;
        this.def_magic = def_magic;

        checkAndWarn();
    }

    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.print("Attack: " + power);
        if(type_power == 1){
            System.out.println(" (physical)");
        }
        else {
            System.out.println(" (magical)");
        }
        System.out.println("Defense: " + def_phy + " (physical), " + def_magic + " (magical)");
        checkAndWarn();
    }

    boolean checkAndWarn(){
        boolean check = true;
        if(hp < 0){
            check = false;
        }
        if(def_magic < 0){
            check = false;
        }
        if(power < 0){
            check = false;
        }
        if(def_phy < 0){
            check = false;
        }
        if(!check){
            System.out.println("warning: value cannot be negative");
        }
        return check;
    }
}

class Team{
    Hero[] members;

    Team(Hero[] members){
        if(is5MemberTeam(members) && isValid(members) && isBalanced(members)){
            // for(int i=0; i<members.length; i++){
            //     if(members[i].checkAndWarn()){
            //         this.members[i] = members[i];
            //     }
            //     else {
            //         this.members[i] = null;
            //     }
            // }
            this.members = members;
        }
    }

    boolean is5MemberTeam(Hero[] members){
        boolean check5 = true;
        if(members.length == 5){
            System.out.println("full team");
            for(int i=0; i<members.length; i++){
                if(members[i] == null){
                    check5 = false;
                    break;
                }
            }
        }
        else {
            if(members.length < 5){
                System.out.println("member is missing");
            }
            else {
                System.out.println("too many members");
            }
            check5 = false;
        }
        return check5;
    }

    boolean isValid(Hero[] members){
        boolean checkName = true;
        if(members.length != 5){
            checkName = false;
        }
        else {
            String name = "";
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(members[i].name.equals(members[j].name) && i!=j){
                        checkName = false;
                        name = members[i].name;
                        break;
                    }
                }
            }
            if(checkName) {
                System.out.println("valid hero selection");
            }
            else {
                System.out.println("cannot select same hero: " + name);
            }
        }
        return checkName;
    }

    boolean isBalanced(Hero[] members){
        if(members.length != 5){
            return false;
        }
        int[] typeHero = new int[6];
        for(int i=0; i<members.length; i++){
            typeHero[members[i].type-1] ++;
        }
    
        boolean check = true;
        for(int i=0; i<4; i++){
            if(typeHero[i] < 1){
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("balanced team");
        }
        else {
            System.out.print("team needs ");
            if(typeHero[0] == 0){
                System.out.print("carry ");
            }
            if(typeHero[1] == 0){
                System.out.print("fighter ");
            }
            if(typeHero[2] == 0){
                System.out.print("mage ");
            }
            if(typeHero[3] == 0){
                System.out.print("tank ");
            }
            System.out.println("");
        }
        return check;
    }
}

class Carry extends Hero{
    Carry(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 1;
    }
}
class Fighter extends Hero{
    Fighter(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 2;
    }
}
class Mage extends Hero{
    Mage(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 3;
    }
}
class Tank extends Hero{
    Tank(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 4;
    }
}
class Support extends Hero{
    Support(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 5;
    }
}
class  Assassin extends Hero{
     Assassin(String name, int hp, int type_power, int power, int def_phy, int def_magic){
        super(name, hp, type_power, power, def_phy, def_magic);
        type = 6;
    }
}

public class AoSU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String name = scan.next();
        // int hp = scan.nextInt();
        // int attkType = scan.nextInt();
        // int attkDmg = scan.nextInt();
        // int phyDef = scan.nextInt();
        // int magDef = scan.nextInt();

        // Hero hero = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
        // hero.printInfo();
        // System.out.println(hero.checkAndWarn());

        int N = scan.nextInt();
        Hero[] members = new Hero[N];
        for(int i=0; i<N; i++){
            int type = scan.nextInt();
            String name = scan.next();
            int hp = scan.nextInt();
            int attkType = scan.nextInt();
            int attkDmg = scan.nextInt();
            int phyDef = scan.nextInt();
            int magDef = scan.nextInt();

            if(type == 1){
                members[i] = new Carry(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 2){
                members[i] = new Fighter(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 3){
                members[i] = new Mage(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 4){
                members[i] = new Tank(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 5){
                members[i] = new Support(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else {
                members[i] = new Assassin(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }

        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
    }
}
