import java.util.Scanner;

class CPU{
    public String type;
    public int fast;
    public int socket;
    public int ram;
    public boolean valid;

    CPU(String type, int fast, int socket, int ram){
        this.type = type;
        this.fast = fast;
        this.socket = socket;
        this.ram = ram;

        valid = isValidSpec(type, fast, socket, ram);
    }

    boolean isValidSpec(String type, int fast, int socket, int ram){
        if(type != null && type.length() > 0 && fast > 0 && socket > 0 && ram > 0 && ram <= 10){
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo(){
        System.out.println(type);
        System.out.println(fast);
        System.out.println(socket);
        System.out.println(ram);
        System.out.println(valid);
    }
}

class MainBoard{
    public String model;
    public int socket;
    public int ram; 
    public boolean valid;

    MainBoard(String model, int socket, int ram){
        this.model = model;
        this.socket = socket;
        this.ram = ram;

        valid = isValidSpec(model, socket, ram);
    }

    boolean isValidSpec(String model, int socket, int ram){
        if(model != null && model.length() > 0 && socket > 0 && ram > 0 && ram <= 10){
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo(){
        System.out.println(model);
        System.out.println(socket);
        System.out.println(ram);
        System.out.println(valid);
    }
}

class Computer{
    CPU cpu;
    MainBoard mainboard;
    boolean valid;

    Computer(CPU cpu, MainBoard mainboard){
        this.cpu = cpu;
        this.mainboard = mainboard;

        valid = isvalidCom(cpu, mainboard);
    }

    boolean isvalidCom(CPU cpu, MainBoard mainBoard){
        if(cpu.valid && mainBoard.valid && cpu.socket == mainboard.socket && cpu.ram == mainboard.ram){
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo(){
        if(valid){
            System.out.println(cpu.type);
            System.out.println(cpu.fast);
            System.out.println(mainboard.model);
            System.out.println(mainboard.socket);
            System.out.println(mainboard.ram);
        }
        else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mainboard.printInfo();
        }
    }
}

public class ComSpec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();

        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        MainBoard mb = new MainBoard(model, socket, memType);

        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
