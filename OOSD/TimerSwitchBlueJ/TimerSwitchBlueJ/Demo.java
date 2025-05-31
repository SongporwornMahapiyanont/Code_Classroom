public class Demo
{
  public static void test(){
      TSClock clock1 = new TSClock(9,0,0);
      TSClock clock2 = new TSClock(9,0,0);
      TimerSwitch ts1 = new TimerSwitch(clock1); 
      TimerSwitch ts2 = new TimerSwitch(clock2);
      Load light = new Light();
      Load motor = new Motor();
     
      ts1.connectTo(light);
      ts2.connectTo(motor);
      ts1.addOnProgram("09:01");
      ts2.addOnProgram("09:01");
      ts1.addOffProgram("09:02");
      ts2.addOffProgram("09:02");
      ts1.redButton();
      ts1.redButton();
      ts2.redButton();
      ts2.redButton();
      ts1.powerOn();
      ts2.powerOn();
      
      
      
      
      //TSClock clock = new TSClock(9,0,0);
      //TimerSwitch ts = new TimerSwitch(clock);
      //Load light = new Light();
      //ts.connectTo(light);
      //กำหนดเวลาเปิด
      // กำหนกเวลาปิด
      //ts.addOnProgram("09:01");
      //ts.addOffProgram("09:02");
      //ts.redButton();
      //ts.redButton();
      //ts.powerOn();
  }
}
