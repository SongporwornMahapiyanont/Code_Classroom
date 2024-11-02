package pokemon;

class FirePokimon extends Pokimon{ 
    FirePokimon(PokiStats p,String name,int level){
        super(p, name, level);
    }
    int attack(WaterPokimon opponent){
        return attack();
    }
    int attack(FirePokimon opponent){
        return attack();
    }
    int attack(ElectricPokimon opponent)
    {
        return attack()*2;
    }
}
