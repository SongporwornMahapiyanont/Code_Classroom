package RolePlayingGame;

class Monster extends GameCharacter{
    int score;
    Monster(String nameMonster,int Level, int score){
        super(nameMonster, (Level*2), (Level*3), Level);
        this.score = score;
    }
}
