import java.util.Scanner;

class GameCharacter{
    String name;
    int attack;
    int defense;
    int level;

    void stat(){
        System.out.println(name + " " + level + " " + attack + " " + defense);
    }
}

class Hero45 extends GameCharacter{
    Hero45(String name){
        this.name = name;
        attack = 10;
        defense = 5;
        level = 1;
    }

    void hit(Monster x){
        int level_up = x.score / 100;
        if(level_up > 0){
            attack += 3*level_up;
            defense += 2*level_up;
            level += level_up;
        }
    }
}

class Monster extends GameCharacter{
    int score;
    Monster(String name, int level, int score){
        this.name = name;
        this.level = level;
        this.score = score;
        attack = level*2;
        defense = level*3;
    }
}

public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        Hero45[] heroes = new Hero45[M];
        for(int i=0; i<M; i++){
            String name = scan.next();
            heroes[i] = new Hero45(name);
        }
        int N = scan.nextInt();
        Monster[] monster = new Monster[N];
        boolean[] alive = new boolean[N];
        for(int i=0;i<N;i++){
            int level = scan.nextInt();
            int score = scan.nextInt();
            monster[i] = new Monster(Integer.toString(i+1),  level, score);
        }
        int K = scan.nextInt();
        for(int i=0;i<K;i++){
            int iHero = scan.nextInt()-1;
            int iMonster = scan.nextInt()-1;
            if (!alive[iMonster]){
                heroes[iHero].hit(monster[iMonster]);
                alive[iMonster] = !alive[iMonster];
            }
        }
        for(int i=0;i<M;i++){
            heroes[i].stat();
        }
    }
}