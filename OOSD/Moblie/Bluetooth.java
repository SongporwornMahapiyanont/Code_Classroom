public abstract class Bluetooth
{
    private boolean bluetooth;
    private boolean connect;
    public abstract void doWork();
    public abstract void connectBluetooth();
    public abstract void playMusic(boolean playmusic);
    public void setBluetooth(boolean bluetooth){
        this.bluetooth = bluetooth;
        this.connect = false;
        doWork();
    }
    public boolean getBlueTooth(){
        return bluetooth;
    }
    public void connect(){
        this.connect = true;
        connectBluetooth();
    }
    public boolean getConnect(){
        return connect;
    }
    
}
