package AoSU;


class Team {
    Hero[] members = new Hero[5];
    Team(Hero[] members){
        if (is5MemberTeam(members) && isValid(members) && isBalanced(members))
            this.members = members;
        else
            this.members = null;
    }
    boolean isBalanced(Hero[] members) {
        if (members == null || members.length > 5 || members.length < 5) 
        {
            return false;
        } 
        else {
            boolean[] check = new boolean[4];
            String[] role = { "carry", "fighter", "mage", "tank" };
            boolean check2 = true;
            for (int i = 0; i < members.length; i++) {
                if (members[i] instanceof Carry) {
                    check[0] = true;
                }
                if (members[i] instanceof Fighter) {
                    check[1] = true;
                }
                if (members[i] instanceof Mage) {
                    check[2] = true;
                }
                if (members[i] instanceof Tank) {
                    check[3] = true;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (check[i] == false) {
                    check2 = false;
                }
            }
            if (check2 == false) {
                System.out.print("team needs");
                for (int i = 0; i < 4; i++) {
                    if (check[i] == false) {
                        System.out.print(" " + role[i]);
                    }
                }
                System.out.println();
                return false;
            }
        }
        System.out.println("balanced team");
        return true;
    }

    boolean is5MemberTeam(Hero[] members){
        int n = members.length;
        if(n<5)
        {
            System.out.println("member is missing");
            return false;
        }
        else if(n> 5)
        {
            System.out.println("too many members");
            return false;
        }
        else
        {
            System.out.println("full team");
            return true;
        }
    }
    boolean isValid(Hero[] membersIsValid){
        int n = membersIsValid.length;
        if(n<5)
        {
            return false;
        }
        else if(n > 5)
        {
            return false;
        }
        for(int i=0;i<membersIsValid.length;i++)
        {
            int count=0;
            for(int j=0;j<membersIsValid.length;j++)
            {
                if(membersIsValid[i].nameHero.equals(membersIsValid[j].nameHero))
                {
                    count++;
                }
            }
            if(count>=2)
            {
                System.out.println("cannot select same hero: " + membersIsValid[i].nameHero);
                return false;
            }
            
        }
        System.out.println("valid hero selection");
        return true;
    }
}
