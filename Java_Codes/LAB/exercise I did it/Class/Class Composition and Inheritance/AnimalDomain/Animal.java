package AnimalDomain;
class Animal{
    String name;
    int lifeExpect,age;
    boolean die = false;
    Animal(String name , int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;
        System.out.println(name + " was born with life expectancy " + lifeExpect + " year(s)");
        
    }
    void live(int time){
        if((age+time)<lifeExpect && die == false)
        {
            this.age+=time;
            if(time!=1)
                System.out.println(name + " lived " + time + " more years");
            else
            System.out.println(name + " lived " + time + " more year");
        }
        else if((age+time) > lifeExpect && die == false)
        {
            int Usetime = 0;
            for(int i=age;i<lifeExpect;i++)
            {
                Usetime+=1;
            }
            this.die = true;
            this.age+=time;
            if(time!=1 && Usetime!=1)
                System.out.println(name + " lived " + Usetime + " more years and died");
            else
                System.out.println(name + " lived " + Usetime + " more year and died");
        }
        else if((age+time) == lifeExpect && die == false)
        {
            this.die = true;
            if(time!=1)
                System.out.println(name + " lived " + time + " more years and died");
            else
                System.out.println(name + " lived " + time + " more year and died");
        }
        else if(die || age >= lifeExpect)
        {
                System.out.println(name + " died earlier");
        }
    }
    boolean isAlive(){
        if(die == false)
        {
            System.out.println(name + " is alive");
            return true;
        }
        System.out.println(name + " is dead");
        return false;
    }

}