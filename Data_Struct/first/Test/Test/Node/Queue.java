package Test.Node;
public class Queue {
    private Node queueFront = null;
    private Node queueRear = null;
    private int count =0;

    public void initialize(){
        queueFront = null;
        queueRear = null;
        count = 0;
    }
    public boolean isEmptyQueue(){
        return (queueFront==null);
    }
    public boolean isFullQueue(){
        return false;
    }
    public Node front() throws Exception{
        if(isEmptyQueue())
        {
            throw new Exception("QueueUnderflow");
        }
        return queueFront;
    }
    public Node back() throws Exception{
        if (isEmptyQueue()) {
            throw new Exception("QueueUnderflow");
        }
        return queueRear;
    }
    public void enQueue(int newItem){
        Node newNode = new Node((int)newItem);
        if(queueFront==null)
        {
            queueFront = newNode;
            queueRear = newNode;
        }
        else{
            queueRear.setlink(newNode);
            queueRear = queueRear.getlink();
        }
        count++;
    }
    public int deQueue() throws Exception{
        int item;
        if(isEmptyQueue())
        {
            throw new Exception();
        }
        item = queueFront.getinfo();
        queueFront = queueFront.getlink();
        if(queueFront==null)
            queueRear = null;
        count--;
        return item;
    }
    public int getsize(){
        return count;
    }
    
}
