package Covid19Wins2;

import java.util.ArrayList;

class Place {
    ArrayList<Integer> idPlace = new ArrayList<>();
    ArrayList<String> namePlace = new ArrayList<>();
    void addPlace(int idPlace, String namePlace){
        this.idPlace.add(idPlace);
        this.namePlace.add(namePlace);
    }
}
