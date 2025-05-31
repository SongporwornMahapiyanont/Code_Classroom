public class Truck extends Vehicles
{ 
   public Truck(double fuelQuantity, double fuelConsumption){
        setFuelQuantity(fuelQuantity);
        setCurrentFuel(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }
   
   public boolean CalculateDistance(double distance){
       return (distance*(getFuelConsumption()+1.6)) <= getCurrentFuel();
   }
    
   public void Drive(double distance){
       if (CalculateDistance(distance)){
           System.out.println("Truck travelled " + distance +" km");
           double updateFuel = (getCurrentFuel() - (distance*(getFuelConsumption()+1.6)));
           setCurrentFuel(updateFuel);
       } else{
           System.out.println("Truck needs refueling");
       }
   }
   
   public void Refuel(double newFuel){
        double currentFuel = getCurrentFuel();
        double fuelCapacity = getFuelQuantity();
        if (currentFuel + newFuel <= fuelCapacity) {
            setCurrentFuel(currentFuel + newFuel);
        }
   }
   
   public void getFuel(){
       System.out.printf("Truck: %.2f\n" ,getCurrentFuel());
   }
}
