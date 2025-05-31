public class Demo
{
  public static void test(){
    Car car = new Car(30.4, 0.3);
    Truck truck = new Truck(99.34, 0.9);
    //Bus bus = new Bus(40,0.3,150);
    
      
    /*
    car.Drive(9);
    car.Drive(30);
    car.Refuel(50);
    truck.Drive(10);
    
    car.getFuel();
    truck.getFuel();
    */
     
    car.Drive(500);
    car.Drive(13.5);
    truck.Refuel(10.300);
    truck.Drive(56.2);
    car.Refuel(100.2);
    
    car.getFuel();
    truck.getFuel();
    
  }
}
