import java.util.Scanner;
class WaterTank { 
   // Enter your code here.
   int capacity;
   int volume;
   WaterTank(int width,int length,int height){
      this.capacity = width*length*height;
      this.volume = 0;
   }
   public int fill(int amount){
      if((volume+amount) > capacity)
      {
         System.out.println("Cannot fill the tank");
         return -1;
      }
      this.volume = volume+amount;
      return volume;
   }
}
public class TankObserver {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int width = scan.nextInt();
    int length = scan.nextInt();
    int height = scan.nextInt();
    WaterTank tank = new WaterTank(width,length,height);
    for(int i = 0; i < 5; ++i) {
      int amount = scan.nextInt();
      System.out.println(tank.fill(amount));
   }
   scan.close();
 }
}