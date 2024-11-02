package pokemon;

class Pokimon{
    PokiStats p;
    String name;
    int level;
    int enegy;
    Pokimon(PokiStats p,String name,int level){
        this.p = p;
        this.name = name;
        this.level = level;
        this.enegy = p.hps[level];
    }
    int attack(){
        return p.attks[level];
    }
    int defend(){
        return p.defends[level];
    }
}
