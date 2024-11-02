package Covid19Wins;

class Visitation {
    // Enter your code here
    int id,date,count=0;
    int[] time = new int[24];
    Visitation(int id, int date){
        this.id = id;
        this.date = date;
    }
    void visit(int time){
        if(time<0 || time>23)
        {
            System.out.println("invalid hour: " + time);
        }
        else
        {
            this.time[time] = 1;
            this.count+=1;
        }
    }
    int count(){
        if(count<=0)
        {
            return 0;
        }
        return count;
    }
    void printVisitHours(String name){
        System.out.println(name);
        System.out.println(date);
        System.out.println(count);
        if(count>0)
        {
            for(int i=0;i<24;i++)
            {
                if(time[i]==1)
                {
                    System.out.print(i + " ");
                }
                
            }
        }
        else
        {
            System.out.println("no visit");
        }
    }
}
