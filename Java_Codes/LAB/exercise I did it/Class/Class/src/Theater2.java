import java.util.Scanner;
class Theater {
    boolean threeD;
    boolean luxury;
    int numSeats;
    boolean[] seats;
    String title;
    int basePrice =-1;

    Theater(boolean threeD,boolean luxury,int numSeats){
       this.threeD = threeD;
       this.luxury = luxury;
       this.numSeats = numSeats;
       this.seats = new boolean[numSeats+1];
    }
    void setTitle(String title){
        if(title != null && title.length()!=0)
        {
            this.title = title;
        }
        else
        {
            System.out.println("invalid title");
        }
    }
    void setBasePrice(int basePrice){
        if(basePrice == 0 || basePrice < 0 )
        {
            System.out.println("invalid price");
        }
        else
        {
            this.basePrice = basePrice;
        }
    }
    void printInfo(){
        if(threeD)
        {
            System.out.println("3D");
        }
        else
        {
            System.out.println("No 3D");
        }
        if(luxury)
        {
            System.out.println("Luxury");
        }
        else
        {
            System.out.println("Standard");
        }
        System.out.println(seats.length-1);
        if(title != null)
        {
            System.out.println(title);
        }
        else
        {
            System.out.println("title is not set");
        }
        if(basePrice >0)
        {
            System.out.println(basePrice);
        }
        else
        {
            System.out.println("price is not set");
        }

    }


    int reserveOne(int seatNumber) {
        if(seatNumber<=0 || (seatNumber>=this.seats.length))
        {   
            System.out.println("sorry");
            return -1; //if we find return, it will stop worked in method.
        }
        if(this.seats[seatNumber])
        {
            System.out.println("sorry");
            return -1; //if we find return, it will stop worked in method.
        } 
        

        // It's can access this code because not find return, it's cannot stop work


        this.seats[seatNumber] = true; 
        return basePrice; //if we find return, it will stop worked in method.
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        int start = seatNumber;
        int end = seatNumber+numSeats-1;

        if(start <=0 || start>=this.seats.length)
        {
            System.out.println("sorry");
            return -1; //if we find return, it will stop worked in method.
        }
        if(end <=0 || end>=this.seats.length)
        {
            System.out.println("sorry");
            return -1; //if we find return, it will stop worked in method.
        }

        for(int i=start;i<=end;i++)
        {
            if(this.seats[i])
            {
                System.out.println("sorry");
                return -1; //if we find return, it will stop worked in method.
            }
        }

        // It's can access this code because not find return, it's cannot stop work

        for(int i=start;i<=end;i++)
        {
            this.seats[i] = true;
        }
        return basePrice*numSeats; //if we find return, it will stop worked in method.
    }

}
// Do not modify the code below. You must leave it as is.
public class Theater2 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);
        scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);
        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }
        t.printInfo();
        scan.close();
 }
}