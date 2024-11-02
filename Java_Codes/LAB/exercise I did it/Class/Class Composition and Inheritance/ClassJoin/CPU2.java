package ClassJoin;

class CPU2 extends Component{
    int clocks;
    CPU2(String model,int clocks,int socket,int memType){
        super(model,socket, memType);
        this.clocks = clocks;
        this.valid = isValid();
    }
    @Override
    void printlnfo() {
        super.printlnfo();
        System.out.println(clocks);
    }
    @Override
    boolean isValid() {
        boolean check = super.isValid();
        if(check)
        {
            if(this.clocks>0)
            {
                return true;
            }
        }
        return false;
        
    }
}
