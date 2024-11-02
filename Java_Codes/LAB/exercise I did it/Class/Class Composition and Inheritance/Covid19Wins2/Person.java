package Covid19Wins2;

import java.util.ArrayList;

class Person {
    String namePerson;        
    ArrayList<Visitation> v = new ArrayList<>(); 
    
    // ArrayList record id date time only
    Person(String namePerson){
        this.namePerson = namePerson;
    }   
    void addVisiation(Visitation visitation){ // check before record
        if(visitation.count()!=0)
        {
            v.add(visitation);
        }
    }
    void printAllVisitation(int index, String namePlace){
        v.get(index).printVisitHours(namePlace);
        System.out.println();
    }
}
