import java.util.TimerTask;
import java.util.Timer;
import java.time.LocalTime;

public class Clock extends TimerTask{
    private Timer timer = new Timer();
    private LocalTime currentTime;
    Clock(){
        currentTime = LocalTime.now();
        timer.scheduleAtFixedRate(this, 0, 1000);
    }
    public void run() {
        System.out.println("Current Time: " + LocalTime.now().toString().substring(0,8));
    }
}