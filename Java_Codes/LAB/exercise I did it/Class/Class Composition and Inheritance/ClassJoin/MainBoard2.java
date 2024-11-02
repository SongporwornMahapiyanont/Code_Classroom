package ClassJoin;

class MainBoard2 extends Component{
    MainBoard2(String model,int socket,int memType){
        super(model,socket, memType);
        this.valid = super.isValid();
    }
}
