import java.util.ArrayList;
import java.util.Scanner;

class Visitation{
    int ID;
    int date;
    int[] time;
    
    Visitation(int ID, int date){
        this.ID = ID;
        this.date = date;

        time = new int[24];
    }

    void visit(int time){
        if(!(time < 0 || time > 23)){
            this.time[time]++;
        }
        else{
            System.out.println("invalid hour: " + time);
        }
    }

    int count(){
        int count_ = 0;
        for(int i=0; i<24; i++){
            count_ += time[i];
        }
        return count_;
    }

    void printVisitHours(String name){
        System.out.println(name);
        System.out.println(date);
        int count = count();
        System.out.println(count);
        if(count > 0){
            for(int i=0; i<24; i++){
                if(time[i] > 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            System.out.println("no visit");
        }
    }
}

class Person{
    String name;
    ArrayList<Visitation> vs = new ArrayList<>();
    Place place;

    Person(String name){
        this.name = name;
    }

    void addVisitation(Visitation vs){
        if(vs.count() > 0){
            this.vs.add(vs);
        }
    }

    void printAllVisitations(){
        System.out.println(vs.size());
        for(int i=0; i<vs.size(); i++){
            vs.get(i).printVisitHours(place.findName(vs.get(i).ID));
        }
    }

    void addPlace(Place place){
        this.place = place;
    }

}

class Place{
    int[] ID;
    String[] name;

    Place(int[] ID, String[] name){
        this.ID = ID;
        this.name = name;
    }

    String findName(int ID){
        String name = "";
        for(int i=0; i<this.ID.length; i++){
            if(this.ID[i] == ID){
                name = this.name[i];
            }
        }
        name = name.substring(1, name.length());
        return name;
    }
}

public class Covid19Wins1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int ID = scan.nextInt();
        // int date = scan.nextInt();
        // final int k = scan.nextInt();

        // Visitation vs = new Visitation(ID, date);
        // for(int i=0; i<k; i++){
        //     int num = scan.nextInt();
        //     vs.visit(num);
        // }

        // vs.printVisitHours();

        int p = scan.nextInt();
        int[] ID = new int[p];
        String[] name = new String[p];
        for(int i=0; i<p; i++){
            ID[i] = scan.nextInt();
            name[i] = scan.nextLine();
        }
        Place place = new Place(ID, name);

        String person = scan.nextLine();
        Person ps = new Person(person);
        ps.addPlace(place);

        int n = scan.nextInt();
        Visitation vs = null;
        for(int i=0; i<n; i++){
            int ID_ = scan.nextInt();
            int date = scan.nextInt();
            final int k = scan.nextInt();

            vs = new Visitation(ID_, date);
            for(int j=0; j<k; j++){
                int time = scan.nextInt();
                vs.visit(time);
            }
            ps.addVisitation(vs);
        }
        ps.printAllVisitations();
    }
}
