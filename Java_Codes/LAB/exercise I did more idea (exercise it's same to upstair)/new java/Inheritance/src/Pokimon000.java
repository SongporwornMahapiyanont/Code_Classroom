import java.util.Scanner;

class PokiStats{
    int[] hp;
    int[] attk;
    int[] defends;

    PokiStats(int[] hp, int[] attk, int[] defends){
        this.hp = new int[6];
        this.attk = new int[6];
        this.defends = new int[6];

        for(int i=0; i<6; i++){
            this.hp[i] = hp[i];
            this.attk[i] = attk[i];
            this.defends[i] = defends[i];
        }
    }
}

class Pokimon{
    PokiStats poki;
    String name;
    int level;
    int energy;

    Pokimon(PokiStats poki, String name, int level){
        this.poki = poki;
        this.name = name;
        this.level = level;

        energy = poki.hp[level];
    }

    int attack(){
        return poki.attk[level];
    }

    int defend(){
        return poki.defends[level];
    }
}

class WaterPokimon extends Pokimon{
    WaterPokimon(PokiStats poki, String name, int level){
        super(poki, name, level);
    }

    int attack(WaterPokimon opponent){
        return poki.attk[level];
    }
    int attack(FirePokimon opponent){
        return poki.attk[level] * 2;
    }
    int attack(ElectricPokimon opponent){
        return poki.attk[level];
    }
}
class FirePokimon extends Pokimon{
    FirePokimon(PokiStats poki, String name, int level){
        super(poki, name, level);
    }

    int attack(WaterPokimon opponent){
        return poki.attk[level];
    }
    int attack(FirePokimon opponent){
        return poki.attk[level];
    }
    int attack(ElectricPokimon opponent){
        return poki.attk[level] * 2;
    }
}
class ElectricPokimon extends Pokimon{
    ElectricPokimon(PokiStats poki, String name, int level){
        super(poki, name, level);
    }

    int attack(WaterPokimon opponent){
        return poki.attk[level] * 2;
    }
    int attack(FirePokimon opponent){
        return poki.attk[level];
    }
    int attack(ElectricPokimon opponent){
        return poki.attk[level];
    }
}

public class Pokimon000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //POKIMON 1
        // int n = scan.nextInt();
        // PokiStats[] poki = new PokiStats[n];

        // int[] hps = new int[6];
        // int[] attks = new int[6];
        // int[] defends = new int[6];

        // for(int i=0; i<n; i++){
        //     for(int j=1; j<=5; j++){
        //         hps[j] = scan.nextInt();
        //     }
        //     for(int j=1; j<=5; j++){
        //         attks[j] = scan.nextInt();
        //     }
        //     for(int j=1; j<=5; j++){
        //         defends[j] = scan.nextInt();
        //     }
        //     poki[i] = new PokiStats(hps, attks, defends);
        // }

        // for(int i = 0; i < n; ++i) {
        //     PokiStats p = poki[i];
        //     for(int level = 1; level <= 5; ++level)
        //     System.out.print(p.hp[level] + " ");
        //     System.out.println();
            
        //     for(int level = 1; level <= 5; ++level)
        //     System.out.print(p.attk[level] + " ");
        //     System.out.println();
            
        //     for(int level = 1; level <= 5; ++level)
        //     System.out.print(p.defends[level] + " ");
        //     System.out.println();
        // }

        //POKIMON 2
        // int[] hps = new int[6];
        // int[] attks = new int[6];
        // int[] defends = new int[6];

        // for(int level = 1; level <= 5; ++level)
        //     hps[level] = scan.nextInt();
        // for(int level = 1; level <= 5; ++level)
        //     attks[level] = scan.nextInt();
        // for(int level = 1; level <= 5; ++level)
        //     defends[level] = scan.nextInt();
        // PokiStats stats = new PokiStats(hps, attks, defends);

        // String name = scan.next();
        // int level = scan.nextInt();
        // Pokimon mon = new Pokimon(stats, name, level);

        // System.out.println(mon.name);
        // System.out.println(mon.energy);
        // System.out.println(mon.attack());
        // System.out.println(mon.defend());

        //POKIMON 3
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;

        for(int i=1; i<=3; i++){
            for(int level = 1; level <= 5; ++level)
                hps[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                attks[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                defends[level] = scan.nextInt();
            PokiStats stats = new PokiStats(hps,attks,defends);

            String name = scan.next();
            int level = scan.nextInt();
            if(i == 1)
                water = new WaterPokimon(stats, name, level);
            else if(i == 2)
                fire = new FirePokimon(stats, name, level);
            else if(i == 3)
                electric = new ElectricPokimon(stats, name, level);
        }
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " + water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
    }
}
