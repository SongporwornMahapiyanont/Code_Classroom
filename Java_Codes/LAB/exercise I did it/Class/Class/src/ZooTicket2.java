import java.util.Scanner;


class ZooTicket{
    Scanner scan = new Scanner(System.in);
    String name;
    boolean ride = false;
    boolean seal = false;
    boolean tiger = false;  

    int price = 100;

    public ZooTicket(String name)
    {
        this.name = name;
    }
    public void bookRide()
    {
        price+=40;
        ride = true; //it's will send "use" but if it not use,it will sended"false"
    }
    public void bookSealShow()
    {
        price+=50;
        seal = true; //it's will send "use" but if it not use,it will sended "false"
    }
    public void bookTigerShow()
    {
        price+=65;
        tiger = true; //it's will send "use" but if it not use,it will sended"false"
    }
    public void summarize()
    {
        System.out.println(name);
        if(ride)
            System.out.println("Ride");
        if(seal)
            System.out.println("Seal");
        if(tiger)
            System.out.println("Tiger");
        System.out.println(price);
    }

    public boolean useRide()
    {
        if(ride) //it will check for "Use" or "not Use" by if you will Use it, You can use it once only.
        {
            System.out.println("okay");
            ride = false;
            return true;
        }
        else 
        {
            System.out.println("no");
            return false;
        }
    }
    public boolean enterSealShow()
    {
        if(seal) //it will check for "Use" or "not Use" by if you will Use it, You can use it once only.
        {
            System.out.println("okay");
            seal = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }  
    public boolean enterTigerShow()
    {    
        if(tiger) //it will check for "Use" or "not Use" by if you will Use it, You can use it once only.
        {
            System.out.println("okay");
            tiger = false;  
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }
}

public class ZooTicket2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int number = sc.nextInt();
    
        ZooTicket z = new ZooTicket(name);



        while(number!=0)
        {
            if(number == 1)
            {
                z.bookRide();                
            }
            else if(number == 2)
            {
                z.bookSealShow();
            }
            else if(number == 3)
            {
                z.bookTigerShow();
            }
            number = sc.nextInt();
        }
        z.summarize();

        int Q = sc.nextInt();
        for(int i=0;i<Q;i++)
        {
            int request = sc.nextInt();
            if(request == 1)
            {
                System.out.println(z.useRide());
            }
            else if(request == 2)
            {
               System.out.println(z.enterSealShow());
            }
            else if(request == 3 )
            {
                System.out.println(z.enterTigerShow());
            }
        }
        sc.close();
    }
}
