public class Demo
{
   public static void main(){
        Bluetooth phone = new Phone();
        Bluetooth headphone = new HeadPhone();
        Clock clock = new Clock();
        phone.setBluetooth(true);
        headphone.setBluetooth(true);
        phone.connect();
        headphone.connect();
        phone.playMusic(true);
        headphone.playMusic(true);
    }
}
