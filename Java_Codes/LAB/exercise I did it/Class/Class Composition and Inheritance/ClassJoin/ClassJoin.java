package ClassJoin;

import java.util.Scanner;

public class ClassJoin  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        
        if(model.length() == 0 && socket % 2 ==0)
        {
            model = null;
        }
        Component cpu = new CPU2(model,clocks,socket,memType);
        cpu.printlnfo();
        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if(model.length() == 0 && socket % 2 == 0 )
        {
            model = null;
        }
        Component mb = new MainBoard2(model,socket,memType);
        mb.printlnfo();
        scan.close();
    }
}
