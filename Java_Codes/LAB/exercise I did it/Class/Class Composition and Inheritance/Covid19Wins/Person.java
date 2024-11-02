package Covid19Wins;

import java.util.ArrayList;

class Person {
    String namePerson;
    ArrayList<Visitation> v = new ArrayList<>();
    Person(String namePerson){
        this.namePerson = namePerson;
    }    
    void addVisitation(Visitation v){
        int value = v.count();
        if(value > 0)
        {
            this.v.add(v); 
        }
    }

    void printAllVisitations(int index, String j){
        
        v.get(index).printVisitHours(j);
        System.out.println();
    }
}
