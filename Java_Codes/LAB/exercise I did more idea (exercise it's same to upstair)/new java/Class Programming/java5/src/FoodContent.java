import java.util.Scanner;

class Food{
    String name;
    String material;
    int weight;

    Food(String name, String material, int weight){
        this.name = name;
        this.material = material;
        this.weight = weight;
    }

    void addContent(String material, int weight){
        this.material += " " + material;
        this.weight += weight;
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(material);
    }
}

public class FoodContent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String material = scan.next();
        int weight = scan.nextInt();
        Food f = new Food(name, material, weight);

        for(;;){
            int order = scan.nextInt();
            if(order == 1){
                f.printInfo();
            }
            else if(order == 2){
                material = scan.next();
                weight = scan.nextInt();
                f.addContent(material, weight);
            }
            else{
                break;
            }
        }
    }
}
