package AoSU;

class Hero {
    String nameHero;
    int Hp,TypeAtk,Atk,DefAtk,DefSpell;
    boolean check;
    Hero(String nameHero, int Hp, int TypeAtk, int Atk, int DefAtk, int DefSpell){
        this.nameHero = nameHero;
        this.Hp = Hp;
        this.TypeAtk = TypeAtk;
        this.Atk = Atk;
        this.DefAtk = DefAtk;
        this.DefSpell = DefSpell;
        checkAndWarn();
    }
    boolean checkAndWarn(){
        if(Hp<0 || TypeAtk<0 || Atk<0 || DefAtk<0 || DefSpell<0)
        {
            this.check = false;
            System.out.println("warning: value cannot be negative");
        }
        else
        {
            this.check = true;
        }
        return check;
    }
    void printInfo(){
        System.out.println("Name: " + nameHero);
        System.out.println("HP: " + Hp);
        if(TypeAtk==1)
        {
            System.out.println("Attack: " + Atk + " (physical)");
        }
        else if(TypeAtk==2)
        {
            System.out.println("Attack: " + Atk + " (magical)");
        }
        System.out.println("Defense: " + DefAtk + " (physical), " + DefSpell + " (magical)");
        checkAndWarn();
    }
}
