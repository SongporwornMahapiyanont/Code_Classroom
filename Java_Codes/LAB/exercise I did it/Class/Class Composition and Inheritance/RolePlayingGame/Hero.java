package RolePlayingGame;

class Hero extends GameCharacter{
    Hero(String name){
        super(name, 10, 5, 1);
    }   
    void hit(Monster m){
        int level = m.score/100;
        // System.out.println("level = " + level);
        if(level > 0 )
        {
            super.Level+=level;
            super.attk+=(3)*(level);
            super.def+=(2)*(level);
        }
    } 
}
