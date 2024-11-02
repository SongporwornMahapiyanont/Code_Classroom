package RolePlayingGame;

class GameCharacter {
    String nameHero;
    int attk,def,Level;
    GameCharacter(String name, int attk , int def , int Level){
        this.nameHero = name;
        this.attk = attk;
        this.def = def;
        this.Level = Level;
    }
    void stat(){
        System.out.print(nameHero + " " + Level + " " + attk + " " + def);
        System.out.println();
    }
}
