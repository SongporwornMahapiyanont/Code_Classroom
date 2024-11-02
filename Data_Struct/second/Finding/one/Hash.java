package Finding.one;
public class Hash {
    int value;
    boolean isEmpty;
    boolean move;
    boolean deleted;
    boolean repeat;
    Hash(int v) {
        this.value = v;
        this.isEmpty = true;
        this.move = false;
        this.deleted = false;
        this.repeat = false;
    }
    public boolean isEmpty(){
        return(value==0);
    }
    public boolean deleted(){
        return deleted;
    }
    public void markDeleted(){
        this.deleted = true;
    }
    public boolean isrepeat(){
        return repeat;
    }
    public void setrepeat(){
        this.repeat = true;
    }
}
