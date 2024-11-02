import java.util.ArrayList;
import java.util.Scanner;

class Kaiju{
    private String name,Category,Description;
    private int height,Weight;
    private ArrayList<String> Power = new ArrayList<>();
    
    Kaiju(){
        this.name = "Unknown";
        this.Category = "Unknown";
        this.Description = "Unknown";
    }
    Kaiju(String name)
    {
        this.name = name;
        this.Category = "Unknown";
        this.Description = "Unknown";
    }
    Kaiju(String name,String Category,int height,int Weight,String[] Power,String Description)
    {
        this.name = name;
        this.Category = Category;
        this.height = height;
        this.Weight = Weight;
        for(int i=0;i<Power.length;i++)
        {
            this.Power.add(Power[i]);
        }
        this.Description = Description;
    }

    public void PrintDetail(){
        System.out.println("Kaiju : " + this.name);
        System.out.println("< Category: Category "+ this.Category + " >");
        if(height != 0)
        {
            System.out.println("Height: " + this.height + " feet (" + (this.height/3.2808) + " meters)");
        }
        else
        {
            System.out.println("Height: Unknown");
        }
        if(Weight != 0 )
        {
            System.out.println("Weight: " + this.Weight + " tons");
        }
        else
        {
            System.out.println("Weight: Unknown");
        }
        if(this.Power.size() !=0 && this.Power.size() > 0)
        {
            System.out.print("Power: ");
            System.out.println("[" + this.Power.size() + "] :");
            for(int i=0;i<this.Power.size();i++)
            {
                System.out.println(this.Power.get(i));
            }
        }
        else
        {
            System.out.println("Power: Unknown");
        }
        System.out.println("Description: " + this.Description);
    }
}


class Jaeger{
    private String name,CoO;
    private int mark;
    private double height;
    private ArrayList<String> controller = new ArrayList<>();
    private ArrayList<String> weapon = new ArrayList<>();
    Jaeger(){
        this.name = "Unknown";
        this.CoO = "Unknown";
    }
    Jaeger(String name){
        this.name = name;
        this.CoO = "Unknown";
    }
    Jaeger(String name , String CoO , int mark , double height , String[] controller , String[] weapon){
        this.name = name;
        this.CoO = CoO;
        this.mark = mark;
        this.height = height;
        for(int i=0;i<controller.length;i++)
        {
            this.controller.add(controller[i]);
        }
        for(int i=0;i<weapon.length;i++)
        {
            this.weapon.add(weapon[i]);
        }
    }

    void PrintDetail(){
        System.out.println("Jaegers : " + this.name);
        System.out.println("< Country of Origin: " + this.CoO + " >");
        if(mark != 0)
            System.out.println("< Mark: Mark-" + this.mark + " >");
        else
            System.out.println("< Mark: Unknown >");
        if(this.height != 0)
            System.out.println("Height: " + this.height + " meters");
        else
            System.out.println("Height: Unknown");


        if(this.controller.size() == 0 )
        {
            System.out.println("Pilots: Unknown");
        }
        else 
        {
            System.out.println("Pilots: [" + this.controller.size() + "] :");
            for (int i = 0; i < this.controller.size(); i++) 
            {
                System.out.println(this.controller.get(i));
            }
        }
        if(this.weapon.size()==0)
        {
            System.out.println("Weapons: Unknown");
        }
        else
        {
            System.out.println("Weapons: [" + this.weapon.size() + "] :");
            for(int i=0;i<this.weapon.size();i++)
            {
                System.out.println(this.weapon.get(i));
            }
        }
    }
}  

public class PacificRim {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Jaeger j = null;
    Kaiju k = null;

    int typeK = sc.nextInt();

    if (typeK == 0) {
        k = new Kaiju();
    } 
    else if (typeK == 1)
    {
        String name = sc.next();
        k = new Kaiju(name);
    } 
    else if (typeK == 2) {
        String name = sc.next();
        String Category = sc.next();
        int height = sc.nextInt();
        int Weight = sc.nextInt();
        String strp = sc.nextLine();
        strp = sc.nextLine();
        String Power[] = strp.split(",");
        String Description = sc.nextLine();
        k = new Kaiju(name, Category, height, Weight, Power, Description);
    }

    int typeJ = sc.nextInt();

    if (typeJ == 0) {
        j = new Jaeger();
    } 
    else if (typeJ == 1) {
        String t = sc.nextLine();
        String name = sc.nextLine();
        j = new Jaeger(name);
    } 
    else if (typeJ == 2) {
        String height = sc.nextLine();
        String name = sc.nextLine();
        String CoO = sc.nextLine();
        int mark = sc.nextInt();
        double h = sc.nextDouble();
        height = sc.nextLine();
        String str = sc.nextLine();
        String strp[] = str.split(",");
        String str2 = sc.nextLine();
        String strw[] = str2.split(",");
        j = new Jaeger(name, CoO, mark, h, strp, strw);
    }
    System.out.println("====================");
    j.PrintDetail();
    System.out.println("VS");
    k.PrintDetail();
    System.out.println("====================");
    }
}
