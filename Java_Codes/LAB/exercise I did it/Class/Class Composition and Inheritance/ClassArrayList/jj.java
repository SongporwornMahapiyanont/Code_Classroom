package ClassArrayList;

import java.util.ArrayList;

class jj {
    ArrayList<String> name;
    jj(ArrayList<String> name){
        this.name = name;
    }
    void PrinInfo(){
        if(name.size()==1)
        {
            System.out.println(name.get(0));
            return;
        }
        System.out.println(name.get(0));
        System.out.println(name.toString());
        name.remove(0);
        PrinInfo();
    }
}
