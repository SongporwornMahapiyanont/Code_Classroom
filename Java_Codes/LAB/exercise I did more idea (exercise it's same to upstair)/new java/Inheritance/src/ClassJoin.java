import java.util.Scanner;

class Component{
    String model;
    int socket;
    int memType;
    boolean valid;

    Component(String model, int socket, int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
    }

    boolean isValidSpec(){
        boolean valid = false;
        if(model != null && model.length() > 0 && socket > 0 && memType > 0 && memType <= 10){
            valid = true;
        }
        return valid;
    }

    void printInfo(){
        System.out.println(valid);
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
    }
}

class CPU2 extends Component{
    int clock;

    CPU2(String model, int clock, int socket, int memType){
        super(model, socket, memType);
        this.clock = clock;
        valid = isValidSpec();
        if(valid && clock <= 0){
            valid = false;
        }
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(clock);
    }
}

class MainBoard2 extends Component{
    MainBoard2(String model, int socket, int memType){
        super(model, socket, memType);
        valid = isValidSpec();
    }
}

public class ClassJoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();

        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        Component cpu = new CPU2(model, clocks, socket, memType);
        cpu.printInfo();

        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        Component mb = new MainBoard2(model, socket, memType);
        mb.printInfo();
    }
}
