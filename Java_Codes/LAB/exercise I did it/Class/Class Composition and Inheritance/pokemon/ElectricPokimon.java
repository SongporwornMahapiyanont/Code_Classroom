package pokemon;

class ElectricPokimon extends Pokimon{
    ElectricPokimon(PokiStats p,String name,int level){
        super(p, name, level);
    }    
    int attack(WaterPokimon opponent){
        return attack()*2;
    }
    int attack(FirePokimon opponent){
        return attack();
    }
    int attack(ElectricPokimon opponent)
    {
        return attack();
    }
}
