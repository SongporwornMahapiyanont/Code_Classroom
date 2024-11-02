package pokemon;

import java.util.Scanner;

public class Pokimon3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        // Read PokiStats
        for(int t = 1; t <= 3; ++t) {
            for(int level = 1; level <= 5; ++level)
                hps[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                attks[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                defends[level] = scan.nextInt();
            PokiStats stats = new PokiStats(hps,attks,defends);
            // Name, level and object creation
            String name = scan.next();
            int level = scan.nextInt();
            if(t == 1)
                water = new WaterPokimon(stats, name, level);
            else if(t == 2)
                fire = new FirePokimon(stats, name, level);
            else if(t == 3)
                electric = new ElectricPokimon(stats, name, level);
        }
    
        // Write output
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " + water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
        scan.close();
    }
}