
public class Motor extends Load
{
    public void doWork(){
        if(getPower()==true){
            System.out.println("The motor is running");
        }
        else{
            System.out.println("The motor is stop");
        }
        
    }
}
