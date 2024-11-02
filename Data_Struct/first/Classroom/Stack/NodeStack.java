package Stack;
public class NodeStack {
    private int info;
    private NodeStack link;
    
    public NodeStack(int info,NodeStack link)
    {
        this.info=info;
        this.link=link;
        
    }
    public NodeStack(int info)
    {
        this(info,null);
        
    }
    public NodeStack()
    {
        this(0,null);
        
    }
    public int getInfo() {
	    return this.info;
    }
    public NodeStack getLink() {
        return this.link;
    }
    public void setInfo(int info) 
    {
	    this.info=info;
    }
    public void setLink(NodeStack link) {
        this.link = link;
    }
    public String toString() {
	    return ""+this.info;
    }
    
}