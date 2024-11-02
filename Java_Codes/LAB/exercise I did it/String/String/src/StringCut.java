import java.util.Arrays;
import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String target = sc.nextLine();

        boolean found = false;
        boolean printed = false;

        while(true)
        {
            int partition = msg.indexOf(target);
            
            if(partition == -1)
            {
                break;
            }
            found = true;
            if(partition !=0)
            {
                printed = true;
                System.out.println(msg.substring(0, partition));
                //keeperse
            }
            //eperse
            msg = msg.substring(partition+1);
        }
        if(!found)
        {
            System.out.println("no target character found");
        }
        else if(found && !printed)
        {
            System.out.println("no output");
        }
        else
        {
            System.out.println(msg);
        }
    }
}
