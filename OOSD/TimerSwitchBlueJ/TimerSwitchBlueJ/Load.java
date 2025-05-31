
public abstract class Load
{
    private boolean power;
    public abstract void doWork();
    public void setPower(boolean power){
        this.power = power;
        this.doWork();
    }
    public boolean getPower(){
        return power;
    }

}
