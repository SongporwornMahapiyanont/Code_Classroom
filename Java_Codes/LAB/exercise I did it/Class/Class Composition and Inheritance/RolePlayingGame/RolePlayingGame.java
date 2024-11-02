package RolePlayingGame;

// import java.util.ArrayList;
import java.util.Scanner;

public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        Hero[] hero = new Hero[M];
        for(int i=0;i<M;i++)
        {
            String name = scan.next();
            hero[i] = new Hero(name);
        }
        int N = scan.nextInt();
        Monster[] monsters = new Monster[N];
        for(int i=0;i<N;i++)
        {
            int level = scan.nextInt();
            int score = scan.nextInt();
            monsters[i] = new Monster(null, level,score);

        }
        int K = scan.nextInt();
        boolean[] check = new boolean[monsters.length];
        for(int i =0;i<K;i++)
        {
            int numberHero = scan.nextInt();
            int numberMonster = scan.nextInt();
            if(!check[numberMonster-1])
            {
                hero[numberHero-1].hit(monsters[numberMonster-1]);
                check[numberMonster-1] = true;
            }
            
        }
        for(int i=0;i<M;i++)
        {
            hero[i].stat();
        }
        scan.close();
    }    
}

