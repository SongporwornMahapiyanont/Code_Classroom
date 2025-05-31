public class Car extends Vehicles
{ 
   public Car(double fuelQuantity, double fuelConsumption){
        setFuelQuantity(fuelQuantity);
        setCurrentFuel(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }
   
   public boolean CalculateDistance(double distance){
       return (distance*(getFuelConsumption()+0.9)) <= getCurrentFuel();
   }
    
   public void Drive(double distance){
       if (CalculateDistance(distance)){
           System.out.println("Car travelled " + distance +" km");
           double updateFuel = (getCurrentFuel() - (distance*(getFuelConsumption()+0.9)));
           setCurrentFuel(updateFuel);
       } else{
           System.out.println("Car needs refueling");
       }
   }
   
   public void Refuel(double newFuel){
        double currentFuel = getCurrentFuel();
        double fuelCapacity = getFuelQuantity();
        setCurrentFuel(getCurrentFuel() + newFuel);
   }
   
   public void getFuel(){
       System.out.printf("Car: %.2f\n" ,getCurrentFuel());
   }
}
