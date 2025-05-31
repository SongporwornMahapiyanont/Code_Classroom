public class Phone extends Bluetooth
{
    public void doWork(){
        if(getBlueTooth() == true)
            System.out.println("Bluetooth Phone on");
        else 
            System.out.println("Bluetooth Phone off");
    }
    public void connectBluetooth(){
        if(getConnect() == true)
        {
            System.out.println("Bluetooth connected");
        }
        else
        {
            System.out.println("Bluetooth connected");
        }
    }
    public void playMusic(boolean playmusic){
        if(playmusic == true )
            System.out.println("Play Music");
        else 
            System.out.println("No play music");
    }
}
