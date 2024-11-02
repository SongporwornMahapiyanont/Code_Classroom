package Stack;

import java.util.Scanner;

class Stackbyarray{
    private int maxStacksize = 100;
    private int stackTop = 0;
    private Object[] list;
    public Stackbyarray(){
        list = new Object[maxStacksize];
    }
    public Stackbyarray(int size){
        list = new Object[size];
        this.maxStacksize = size;
    }
    public void initiallizeStack(){
        for(int i=0;i<stackTop;i++)
        {
            list[i] = null;
        }
        stackTop = 0;
    }
    public boolean isEmptyStack(){
        return (stackTop==0);
    }
    public boolean isFullStack(){
        return (stackTop==maxStacksize);
    }
    public void push(Object newitem) throws Exception{
        if(isFullStack())
        {
            throw new Exception("Stackoverflow");
        }
        list[stackTop] = newitem;
        stackTop+=1;
    }
    public Object pop() throws Exception{
        Object itemInfo;
        if(isEmptyStack())
        {
            throw new Exception("Stackunderflow");
        }
        stackTop-=1;
        itemInfo = list[stackTop];
        list[stackTop] = null;
        return itemInfo;
    }
    public Object peek() throws Exception{
        if(isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        return list[stackTop-1];
    }
    public int getSize(){
        return this.list.length;
    }
    public int getMaxSize(){
        return this.maxStacksize;
    }

    public void Convert(int value) throws Exception{
        Stackbyarray st = new Stackbyarray();
        while (value!=0) {
            st.push(value%2);
            value = value/2;
            // System.out.println(value);
        }
        // System.out.println("==" + st.stackTop);
        for(int j = st.stackTop;j>=0;j--)
        {
            if(st.list[j]!=null)
                System.out.print(st.pop());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		scan= new Scanner(System.in);
        int value = scan.nextInt();
        Stackbyarray st = new Stackbyarray(30);
        st.Convert(value);
    }
}
