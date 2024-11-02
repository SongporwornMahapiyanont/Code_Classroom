package pokemon;

class WaterPokimon extends Pokimon{
    WaterPokimon(PokiStats p,String name,int level){
        super(p, name, level);
    }
    int attack(WaterPokimon opponent){
        return attack();
    }
    int attack(FirePokimon opponent){
        return attack()*2;
    }
    int attack(ElectricPokimon opponent)
    {
        return attack();
    }
}
