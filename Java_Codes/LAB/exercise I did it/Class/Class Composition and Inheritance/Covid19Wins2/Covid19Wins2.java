package Covid19Wins2;

import java.util.Scanner;

public class Covid19Wins2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        

        int P = scan.nextInt(); //Place
        Place place = new Place();
        for(int i=0;i<P;i++)
        {
            int idPlace = scan.nextInt();
            String namePlace = scan.next();
            place.addPlace(idPlace, namePlace);
            
            // All will record value in array it.
        }
    
        
        String namePerson = scan.next();
        Person person = new Person(namePerson);
        
        int N = scan.nextInt();
        for(int i=0;i<N;i++)
        {
            int id = scan.nextInt();
            int date = scan.nextInt();
            Visitation visitation = new Visitation(id, date); 
            final int numhour = scan.nextInt(); // for loop
            for(int j=0;j<numhour;j++)
            {
                int valueDate = scan.nextInt();
                visitation.visit(valueDate); //check time 
            }
            person.addVisiation(visitation); 
        }
        System.out.println(person.v.size());


        for(int i=0;i<person.v.size();i++)
        {
            int indexNamePlace = 0;
            for(int j=0;j<place.namePlace.size();j++)
            {
                if(person.v.get(i).id == place.idPlace.get(j))
                {
                    indexNamePlace = j;
                }
                
            }
            ;
            person.printAllVisitation(i,place.namePlace.get(indexNamePlace));
        }
        
        // visitation.printVisitHours();
        // Create object and correctly use it here
        scan.close();
    }
}