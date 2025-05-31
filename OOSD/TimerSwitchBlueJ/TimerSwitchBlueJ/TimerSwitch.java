import java.util.Timer;

public class TimerSwitch
{
    private Timer timer;
    private TSClock clock;
    private String state; // "ON", "OFF", "Auto"
    private String eSwitch; // "ON", "OFF" the electronic switch
    private Load load;
    private String onPrograms;
    private String offPrograms;
    
    TimerSwitch(TSClock clock){
        this.clock = clock; 
        this.clock.setTimerSwitch(this);
        state = "ON";
        eSwitch = "ON";
        onPrograms = "";
        offPrograms = "";
    }
    
    public void addOnProgram(String when){
        onPrograms += when+",";
        //System.out.println(onPrograms);
    }
    public void addOffProgram(String when){
        offPrograms += when+",";
        //System.out.println(onPrograms);
    }

    public void redButton(){
        if(state.equals("ON")){
            state = "OFF";
            eSwitch = "OFF";
        }
        else if(state.equals("OFF")){
            state = "AUTO";
            eSwitch = "--";
        }
        else{
            state = "ON";
            eSwitch = "ON";
        }
    }
    
    public void powerOn(){
        timer = new Timer(true);
        timer.schedule(clock, 0, 1000);
    }
    
    public void powerOff(){
        if(clock!=null)
            clock.cancel();
        if(timer!=null)
            timer.cancel();
    }
    
    public void connectTo(Load load){
        this.load = load;
    }
    
    public void process(){
        if(state.equals("ON")){
            eSwitch = "ON";
        }
        else if(state.equals("OFF")){
            eSwitch = "OFF";
        }
        else{ // "AUTO"
            //System.out.println("==Auto mode==");
            String currentHM = clock.getCurrentTime().substring(0, 5);
            System.out.println(currentHM);
            if(onPrograms.indexOf(currentHM)!=-1){ // found this time in the onPrograms
                eSwitch = "ON";
            }
            if(offPrograms.indexOf(currentHM)!=-1){ // found this time in the offPrograms
                eSwitch = "OFF";
            }
        }
        
        if(eSwitch.equals("ON")){
            load.setPower(true);
        }else{
            load.setPower(false);
        }
    }
}
