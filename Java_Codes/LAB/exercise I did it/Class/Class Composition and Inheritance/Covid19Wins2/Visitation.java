package Covid19Wins2;

class Visitation {
    int[] time = new int[24]; //time 0-23 
    int id,date,countTime=0;
    Visitation(int id, int date){
        this.id = id;
        this.date = date;
        
    }
    void visit(int time){ // check 
        if(time<0 || time>23)
        {
            System.out.println("invalid hour: " + time);
        }
        else
        {
            this.time[time] = 1;
            countTime+=1;
        }
    }
    int count(){ //record value of time for question of How many?
        if(countTime!=0)
        {
            return countTime;
        }
        return 0;
    }
    void printVisitHours(String namePlace){
        System.out.println(namePlace);
        System.out.println(date);
        System.out.println(count());
        if(count() == 0)
        {
            System.out.println("no visit");
        }
        else 
        {
            for(int i=0;i<time.length;i++)
            {
                if(time[i]==1)
                    System.out.print(i + " ");
            }
        }
    }
}
