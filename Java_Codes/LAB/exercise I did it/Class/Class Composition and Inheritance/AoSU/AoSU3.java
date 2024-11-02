package AoSU;


import java.util.Scanner;

public class AoSU3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = new Hero[N];
        if(N > 0) {
            
            for(int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                if(type == 1)
                {
                   members[i] = new Carry(name, hp, attkType,attkDmg, phyDef, magDef);
                }
                else if(type == 2)
                {
                    members[i] = new Fighter(name, hp, type, attkDmg, phyDef, magDef);
                }
                else if(type ==3)
                {
                    members[i]  = new Mage(name, hp, type, attkDmg, phyDef, magDef);
                }
                else if(type == 4)
                {
                    members[i]  = new Tank(name, hp, type, attkDmg, phyDef, magDef);
                }
                else if(type == 5)
                {
                    members[i]  = new Support(name, hp, type, attkDmg, phyDef, magDef);
                }
                else if(type == 6)
                {
                    members[i]  = new Assassin(name, hp, type, attkDmg, phyDef, magDef);
                }
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
        scan.close();
    }
}
 