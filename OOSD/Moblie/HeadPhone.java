public class HeadPhone extends Bluetooth
{
    public void doWork(){
        if(getBlueTooth() == true)
            System.out.println("Bluetooth Headphone is on");
        else 
            System.out.println("Bluetooth Headphone is off");
    }
    public void connectBluetooth(){
        if(getConnect() == true)
            System.out.println("Headphone connected");
        else
            System.out.println("Headphone not connected");
    }
     @Override
    public void playMusic(boolean playmusic) {
        if (playmusic)
            System.out.println("Playing music on Headphone");
        else
            System.out.println("Music stopped on Headphone");
    }
}
