package Queue.LinkList;


public class NodeQueue {
    private int info;
    private NodeQueue link;
    
    public NodeQueue(Object newItem,NodeQueue link)
    {
        this.info=(int) newItem;
        this.link=link;
        
    }
    public NodeQueue(Object newItem)
    {
        this(newItem,null);
        
    }
    public NodeQueue()
    {
        this(0,null);
        
    }
    public int getInfo() {
	    return this.info;
    }
    public NodeQueue getLink() {
        return this.link;
    }
    public void setInfo(int info) 
    {
	    this.info=info;
    }
    public void setLink(NodeQueue link) {
        this.link = link;
    }
    public String toString() {
	    return ""+this.info;
    }
    
}
