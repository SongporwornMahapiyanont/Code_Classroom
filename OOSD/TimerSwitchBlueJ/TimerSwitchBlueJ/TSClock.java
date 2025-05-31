import java.util.TimerTask;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TSClock extends TimerTask
{
    private TimerSwitch ts;
    private LocalTime currentTime;
    
    public void setTimerSwitch(TimerSwitch ts){
        this.ts = ts;
    }
    
    TSClock(){
        currentTime = LocalTime.now();
    }
    
    TSClock(int hour, int minute, int second){
        currentTime = LocalTime.of(hour, minute, second);
    }
    
    public String getCurrentTime(){
        return currentTime.toString();
    }
    
    public void run(){
        currentTime = currentTime.plusSeconds(1);
        ts.process();
    }
}
