import java.time.LocalDate;
import java.time.DayOfWeek;

public class Day
{
    private LocalDate currentDay;
    Day(){
        currentDay = LocalDate.now();
    }
    public void run(){
        System.out.println(currentDay.getDayOfWeek());
    }
    public DayOfWeek getDay(){
        return currentDay.getDayOfWeek();
    }
}
