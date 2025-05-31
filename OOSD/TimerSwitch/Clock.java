import java.time.LocalTime;
import java.util.TimerTask;
public class Clock extends TimerTask
{
    private LocalTime currentTime;
    Clock(){
        currentTime = LocalTime.now();
    }
    public void run(){
        currentTime = currentTime.plusSeconds(1);
        System.out.println(currentTime);
    }
    public LocalTime getCurrentTime(){
        return currentTime;
    }
}
