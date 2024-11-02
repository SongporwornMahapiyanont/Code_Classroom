import java.util.*;
class Food{
    String food;
    String Comfood;
    int weight;
    int cal;

    String a;
    int w;

    // ArrayList<String> u = new ArrayList<>(); 

    Food(String food,String Comfood,int weight,int cal1){
        this.food = food;
        this.Comfood = Comfood;
        // u.add(Comfood);
        this.weight = weight;
        this.cal = cal1;

    }
    void addContent(String i,int we,int cal2)
    {
        Comfood = Comfood + " " + i;
        // u.add(i);
        this.weight = weight + we;
        this.cal+=(cal2*we);
      

    }
    void pritInfo()
    {
        System.out.println(food);
        System.out.print(weight + " ");
        System.out.println(cal);
        System.out.print(Comfood + " ");
        // for(int i=0;i<u.size();i++)
        // {
        //     System.out.print(u.get(i) + " ");
        // }
    }
}
public class FoodContents2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food = sc.next();
        String Comfood = sc.next();
        int weight = sc.nextInt();
        int cal1 = sc.nextInt();

        cal1 = weight*cal1;

        Food f = new Food(food, Comfood, weight,cal1);
        
        int ques = sc.nextInt();

        while(ques!=0)
        {
            if(ques ==1)
            {
                f.pritInfo();
            }
            else if(ques==2)
            {
                String i = sc.next();
                int we = sc.nextInt();
                int cal2 = sc.nextInt();
                f.addContent(i, we,cal2);
                
            }
            ques = sc.nextInt();
        }
        sc.close();
    }
}
