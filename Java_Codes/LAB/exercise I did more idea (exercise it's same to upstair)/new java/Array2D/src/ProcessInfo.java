import java.util.Scanner;

public class ProcessInfo {

    static boolean listProcesses(int N, String[] name, int[] ram_use, int ram, int count_ram){
        boolean enough = false;
        for(int i=0; i<N; i++){
            System.out.print(name[i]);
            if(ram_use[i] >= 10){
                System.out.print("*");
            }
            System.out.println(" " + ram_use[i]);
        }
        if(count_ram <= ram){
            enough = true;
        }
        return enough;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String[] name = new String[n];
        int[] ram = new int[n];
        int count_ram = 0;
        for(int i=0; i<n; i++){
            name[i] = scan.next();
            ram[i] = scan.nextInt();
            count_ram+=ram[i];
        }
        int ram_have = scan.nextInt();
        
        boolean check = listProcesses(n, name, ram, ram_have, count_ram);
        System.out.println("RAM used = " + count_ram + " out of " + ram_have);
        if(!check){
            System.out.println("Not enough RAM");
        }
        else{
            System.out.println("Sufficient RAM");
        }
    }
}