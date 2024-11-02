package Test.Node;
public class Node {
    private int info;
    private Node link;
    Node(int info,Node link){
        this.info = info;
        this.link = link;
    }
    Node(int info){
        this(info,null);
    }
    Node()
    {
        this(0,null);
    }
    public void setlink(Node LINK){
        this.link = LINK;
    }
    public void setinfo(int INFO)
    {
        this.info = INFO;
    }
    public int getinfo(){
        return info;
    }
    public Node getlink(){
        return link;
    }

    
    
}
