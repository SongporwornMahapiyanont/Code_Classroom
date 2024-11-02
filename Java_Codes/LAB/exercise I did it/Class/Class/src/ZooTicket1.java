import java.util.Scanner;


class ZooTicket{
    Scanner sc = new Scanner(System.in);
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
        ride = true;
    }
    public void bookSealShow()
    {
        price+=50;
        seal = true;
    }
    public void bookTigerShow()
    {
        price+=65;
        tiger = true;
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
}

public class ZooTicket1 {
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
        sc.close();
    }
}
