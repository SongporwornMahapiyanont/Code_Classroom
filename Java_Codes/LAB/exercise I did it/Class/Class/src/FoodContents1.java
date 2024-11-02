import java.util.*;
class Food{
    String food;
    String Comfood;
    int weight;
    String a;
    int w;

    // ArrayList<String> u = new ArrayList<>(); 

    Food(String food,String Comfood,int weight){
        this.food = food;
        this.Comfood = Comfood;
        // u.add(Comfood);
        this.weight = weight;
    }
    void addContent(String i,int we)
    {
        Comfood = Comfood + " " + i;
        // u.add(i);
        weight = weight + we;
    }
    void pritInfo()
    {
        System.out.println(food);
        System.out.println(weight);
        System.out.println(Comfood);
        // for(int i=0;i<u.size();i++)
        // {
        //     System.out.print(u.get(i) + " ");
        // }
    }
}
public class FoodContents1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food = sc.next();
        String Comfood = sc.next();
        int weight = sc.nextInt();

        Food f = new Food(food, Comfood, weight);
        
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
                f.addContent(i, we);
                
            }
            ques = sc.nextInt();
        }
        sc.close();
    }
}
