public class Light extends Load
{
    public void doWork(){
        if(getPower()==true){
            System.out.println("The light is ON");
        }
        else{
            System.out.println("The light is OFF");
        }
        
    }
}