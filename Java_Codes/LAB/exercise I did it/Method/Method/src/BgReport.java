import java.util.Scanner;

public class BgReport {
    public static void reportBg(String name,int birthyear,int start,int age,int length)
    {
        if(length>=2)
        {
            System.out.println("Name: " + name);   
        }
        else
        {
            System.out.println("Name: " + "INVALID");
        }
        if(birthyear>=1900 && birthyear<=2022 && start<=2022)
        {
            if(age>=18)
            {
                System.out.println("Birth year: "+birthyear);
                System.out.println("Start year: " + start);
            }
            else
            {
                System.out.println("Birth year: "+birthyear);
                System.out.println("Start year: " + "INVALID");
            }
        }
        else 
        {
            if(birthyear>=1900 && birthyear<=2022)
            {
                System.out.println("Birth year: "+birthyear);
            }
            else
            {
                System.out.println("Birth year: "+"INVALID");
            }
            System.out.println("Start year: " + "INVALID");
        }
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int bitrhyear = sc.nextInt();
        int start = sc.nextInt();
        int age = start - bitrhyear;
        reportBg(name,bitrhyear,start,age,name.length());
    }
}
