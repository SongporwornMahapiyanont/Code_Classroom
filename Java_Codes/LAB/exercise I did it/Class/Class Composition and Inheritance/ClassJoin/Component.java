package ClassJoin;

class Component {
    String model;
    int TypeSocket,Typemem,clocks;
    boolean valid;
    Component(String model,int socket,int memType){
        this.model = model;
        this.TypeSocket = socket;
        this.Typemem = memType;
    }
    boolean isValid() {
        boolean check = this.model!=null && this.model.length()!=0 && !(this.model.equals("")) && TypeSocket>0 && Typemem<=10 && Typemem>0;
        if(check)
        {
            return true;
        }
        return false;
    }
    void printlnfo(){
        System.out.println(valid);
        System.out.println(model);
        System.out.println(TypeSocket);
        System.out.println(Typemem);
    }
}
