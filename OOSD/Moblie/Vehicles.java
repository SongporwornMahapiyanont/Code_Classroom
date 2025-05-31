public class Vehicles
{
   private double fuelQuantity;
   private double currentFuel;
   private double fuelConsumption; //km/L
   
   public void setFuelQuantity(double fuelQuantity){
       this.fuelQuantity = fuelQuantity;
   }
   
   public void setCurrentFuel(double currentFuel){
       this.currentFuel = currentFuel;
   }
   
   public void setFuelConsumption(double fuelConsumption){
       this.fuelConsumption = fuelConsumption;
   }
   
   public double getFuelQuantity(){
       return fuelQuantity;
   }
   
   public double getCurrentFuel(){
       return currentFuel;
   }
   
   public double getFuelConsumption(){
       return fuelConsumption;
   }
   
   
   
   public boolean CalculateDistance(double distance){
       return ((getCurrentFuel()/getFuelConsumption()) < distance);
   }
}
