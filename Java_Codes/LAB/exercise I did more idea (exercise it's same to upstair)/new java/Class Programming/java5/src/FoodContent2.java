import java.util.Scanner;

class Food1{
    String name;
    String material;
    int weight;
    int cal;

    Food1(String name, String material, int weight, int cal){
        this.name = name;
        this.material = material;
        this.weight = weight;
        this.cal = cal*weight;
    }

    void addContent(String material, int weight, int cal){
        this.material += " " + material;
        this.weight += weight;
        this.cal += cal*weight;
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(weight + " " + cal);
        System.out.print(material + " ");
    }
}

public class FoodContent2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String material = scan.next();
        int weight = scan.nextInt();
        int cal = scan.nextInt();

        Food1 f = new Food1(name, material, weight, cal);
        for(;;){
            int order = scan.nextInt();
            if(order == 1){
                f.printInfo();
            }
            else if(order == 2){
                material = scan.next();
                weight = scan.nextInt();
                cal = scan.nextInt();
                f.addContent(material, weight, cal);
            }
            else{
                break;
            }
        }
    }
}
