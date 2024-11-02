package LinkList;

public class Node {
    private int info;
    private Node link;
    
    public Node(int info,Node link)
    {
        this.info=info;
        this.link=link;
        
    }
    public Node(int info)
    {
        this(info,null);
        
    }
    public Node()
    {
        this(0,null);
        
    }
    public int getInfo() {
	    return this.info;
    }
    public Node getLink() {
        return this.link;
    }
    public void setInfo(int info) 
    {
	    this.info=info;
    }
    public void setLink(Node link) {
        this.link = link;
    }
    public String toString() {
	    return ""+this.info;
    }
    
}