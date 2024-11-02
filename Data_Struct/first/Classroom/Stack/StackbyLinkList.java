package Stack;
import java.util.Scanner;


class StackbyLinkList{
    private static NodeStack head;
    private int maxStacksize;
    private int info;
    public StackbyLinkList(){
    }
    public StackbyLinkList(int Maxsize){
        this.maxStacksize = Maxsize;
        this.head = null;
    }
    public void initiallizeStack(){
        this.head = null;
    }
    public boolean isEmptyStack(){
       return (head==null); 
        // dont use head.getlink()==null cause output will just show not full.
    }
    public boolean isFullStack(){
       return (getSize()==maxStacksize);
    }
    public void push(int binary) throws Exception{
        if(isFullStack())
        {
            throw new Exception("Stackoverflow");
        }
        NodeStack newnode = new NodeStack(binary);
        newnode.setLink(head);
        head = newnode;
        
    }
    public Object pop() throws Exception{
        if (isEmptyStack()) {
            throw new Exception("Stackunderflow");
        }
        NodeStack delNode = head;
        head = head.getLink();
        return delNode;
    }
    public int peek() throws Exception{
        if (isEmptyStack()) {
            throw new Exception("Stackunderflow");
        }
        return head.getInfo();
    }
    public int getSize(){
        int count=1;
        NodeStack temp = head;
        while (temp!=null) {
            temp = temp.getLink();
            count++;
        }
        return count;
    }
    public int getMaxSize(){
        return maxStacksize;
    }
    public void Convert(int deciaml) throws Exception{
        initiallizeStack();
        while (deciaml!=0) {
            push(deciaml%2);
            deciaml = deciaml/2;
            
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		scan= new Scanner(System.in);
        int decimal = scan.nextInt();
        StackbyLinkList st = new StackbyLinkList(100);
        st.Convert(decimal);
        System.out.println("size = " + st.getSize());
        while (!st.isEmptyStack()) {
            System.out.print(st.pop());
        }
    }
}
