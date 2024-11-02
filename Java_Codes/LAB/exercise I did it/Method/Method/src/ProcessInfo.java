import java.util.Scanner;
public class ProcessInfo {
 static boolean listProcesses(String []names,int []ramUses,int Cap,int N) {
     int allRamUses = 0;
     for(int i=0;i<N;i++)
     {
        if(ramUses[i]<10)
        {
            System.out.print(names[i] + " ");
            System.out.println(ramUses[i]);
            allRamUses+=ramUses[i];
        }
        else if(ramUses[i]>=10) 
        {
            System.out.print(names[i] + "* ");
            System.out.println(ramUses[i]);
            allRamUses+=ramUses[i];
        }
     }
     boolean check = true;
     if(allRamUses>Cap)
     {
        check = false;
     }
     return check;
 }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    String[] names = new String[N];
    int[] ramUses = new int[N];
    int allRamUses = 0;
    for(int i=0;i<N;i++)
    {
        names[i] = scan.next();
        ramUses[i] = scan.nextInt();
        allRamUses+=ramUses[i];
    }
    int Cap = scan.nextInt();
    boolean result = listProcesses(names, ramUses,Cap,N);
    System.out.println("RAM used = "+allRamUses +" out of "+Cap);
    if(result == true)
    {
        System.out.println("Sufficient RAM");
    }
    else if(result == false)
    {
        System.out.println("Not enough RAM");
    }
 }
}