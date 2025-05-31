import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
public class TimerSwitch
{
    private Timer timer;
    private Clock clock;
    private Day day;
    private Mode mode;
    private String currentTime; // "HH:mm:ss"
    private String onProgram; // "HH:mm:00", --> "00:00:00" not use
    private String offProgram; // "HH:mm:00", --> "00:00:00" not use
    private boolean electronicSwitch; // switch: true, false
    private String state; // "ON", "OFF", "AUTO"
    private ArrayList<String> days = new ArrayList<>();
    ArrayList<String> allDays = new ArrayList<>();    
    TimerSwitch(Clock clock, Mode mode,Day day){
        this.clock = clock;
        this.day = day;
        this.mode = mode;
        state = "ON";
    }

    public void powerOn(){
        if(timer!=null)
        {
            timer.cancel();
        }
        timer = new Timer();
        clock = new Clock();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                check();
                clock.run();
            }
        }, 0, 1000);

        state = "ON"; 
        electronicSwitch = true;
    }

    public void powerOff(){
          if (timer != null) {
            timer.cancel();
        }
        if (clock != null) {
            clock.cancel();
        }
        electronicSwitch = false;
    }

    public void cancelSetProgram(){
        onProgram = "";
        offProgram = "";
    }

    public void resetData(){
        currentTime = "";
    }

    public void check(){
        currentTime = clock.getCurrentTime().toString();
        currentTime = currentTime.substring(0,8);
        System.out.println("check");
        System.out.println("mode : " + mode.getMode());
        if(mode.getMode()==0)
        {
            if(currentTime.equals(onProgram))
            {
                powerOn();
                state = "ON";
                System.out.println("onProgram");
            }
            else if(currentTime.equals(offProgram))
            {
                powerOff();
                state = "OFF";
                System.out.println("offProgram");
            }
        }
        else 
        {
            if(mode.getModeString().contains(day.getDay()) && currentTime.equals(onProgram))
            {
                powerOn();
                state = "ON";
                System.out.println("onProgram");
            }
            else if(mode.getModeString().contains(day.getDay()) && currentTime.equals(offProgram))
            {
                powerOff();
                state = "OFF";
                System.out.println("offProgram");
            }
        }  
    }
    
    public void redButton(){
        if(state.equals("ON")){
            state = "OFF";
            electronicSwitch = false;
        }
        else if(state.equals("OFF")){
            state = "AUTO";
        }
        else if(state.equals("AUTO")){            
            state = "ON";
            electronicSwitch = true;
        }
    }

    public String checkState(){
        System.out.println(state);
        return state;
    }

    public void setOnProgram(String when){
        onProgram = when;
    }

    public void setOffProgram(String when){
        offProgram = when;
    }
}
