import java.util.ArrayList;
import java.util.Collections;
public class Mode
{
    private int i;
    private int mode;
    private ArrayList<String> modeString;
    Mode(){
        this.mode = 0;
        this.modeString = new ArrayList<>();
        this.i = 0;
    }
    public int getMode(){
        return this.mode;
    }
    public ArrayList getModeString(){
        return modeString;
    }
    public void setMode(){
        if(mode>15)
            this.mode = 0;
        this.mode+=1;
        System.out.println("Mode : " + mode);
        setDate();
    }
    public void setDate(){
        modeString.clear();
        if(this.mode==0)
        {
            
        }
        else if(this.mode==1)
        {
            modeString.add("MONDAY");
            modeString.add("TUESDAY");
            modeString.add("WEDNESDAY");
            modeString.add("THURSDAY");
            modeString.add("FRIDAY");
            modeString.add("SATURDAY");
            modeString.add("SUNDAY");
        }
        else if(this.mode==2)
        {
            modeString.add("MONDAY");
        }
        else if(this.mode==3)
        {
            modeString.add("TUESDAY");
        }
        else if(this.mode==4)
        {
            modeString.add("WEDNESDAY");
        }else if(this.mode==5)
        {
            modeString.add("THURSDAY");
        }else if(this.mode==6)
        {
            modeString.add("FRIDAY");
        }
        else if(this.mode==7)
        {
            modeString.add("SATURDAY");
        }
        else if(this.mode==8)
        {
            modeString.add("SUNDAY");
        }
        else if(this.mode==9)
        {
            Collections.addAll(modeString,"MONDAY", "WEDNESDAY", "FRIDAY");
        }
        
        else if(this.mode==10)
        {
            Collections.addAll(modeString,"TUESDAY","THURSDAY","SATURDAY");
        }
        else if(this.mode==11)
        {
            Collections.addAll(modeString,"SATURDAY","SUNDAY");
        }
        else if(this.mode==12)
        {
            Collections.addAll(modeString,"MONDAY","TUESDAY","WEDNESDAY");
        }
        else if(this.mode==13)
        {
            Collections.addAll(modeString,"THURSDAY","FRIDAY","SATURDAY");
        }
        else if(this.mode==14)
        {
            Collections.addAll(modeString,"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY");
        }
        else if(this.mode==15)
        {
            Collections.addAll(modeString,"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY");
        }
    }
    public ArrayList getDate(){
        return modeString;
    }
    public void println(){
        for(int i=0;i<modeString.size();i++)
        {
            System.out.println(modeString.get(i));
        }
    }
}
