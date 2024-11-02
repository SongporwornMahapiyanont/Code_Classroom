package Test.Node;
public class Stack {
    private int stacksize = 0;
    private Node stacktop = null;
    public Stack(){
        stacktop = null;
    }
    public void initialize(){
        stacktop = null;
    }
    public boolean isEmptyStack(){
        return(stacktop==null);
    }
    public boolean isFullStack()
    {
        return false;
    }
    public void push(Object newItem){
        Node newNode = new Node((int)newItem);
        newNode.setlink(stacktop);
        stacktop = newNode;
        stacksize++;
    }
    public int pop() throws Exception{
        int item;
        if (isEmptyStack()) {
            throw new Exception("StackUnderflow");
        }
        item = stacktop.getinfo();
        stacktop = stacktop.getlink();
        stacksize--;
        return item;
    }
    public int peek() throws Exception{
        if(isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        return stacktop.getinfo();
    }

}
