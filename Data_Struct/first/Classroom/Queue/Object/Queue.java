package Queue.Object;
import java.util.Random;
import java.util.*;;


public class Queue {
    private int maxQueueSize = 100;
    private int QueueFront = 0;
    private int queueRear = maxQueueSize-1;
    private int count = 0;
    private Object[] list;
    public Queue(){
        list = new Object[maxQueueSize];
    }
    public Queue(int size){
        list = new Object[size];
        maxQueueSize = size;
        queueRear = maxQueueSize-1;
    }
    public void initiallizeQueue(){
        for(int i = QueueFront;i<queueRear;i=(i+1) % maxQueueSize)
        {
            list[i] = null;
        }
        QueueFront = 0;
        queueRear = maxQueueSize-1;
        count = 0 ;
    }
    public boolean isEmptyQueue(){
        return (count==0);
    }
    public boolean isFullQueue(){
        return (count==maxQueueSize);
    }
    public void enqueue(int newItem) throws Exception{
        if(isFullQueue()){
            throw new Exception("Queueoverflow");
        }
        queueRear = (queueRear+1) % maxQueueSize;
        count+=1;
        list[queueRear] = newItem;
    }
    public void deQueue() throws Exception{
        if (isEmptyQueue()) {
            throw new Exception("QueueUnderflow");
        }
        count--;
        list[queueRear] = null;
        queueRear = (queueRear+1) % maxQueueSize;
    }
    public int getSize(){
        return count;
    }
    public int getMaxSize(){
        return maxQueueSize;
    }
    public Object front() throws Exception{
        if (isEmptyQueue()) {
            throw new Exception("QueueUnderflow");
        }
        return list[QueueFront];
    }
    public Object back() throws Exception{
        if (isEmptyQueue()) {
            throw new Exception("QueueUnderflow");
        }
        return list[queueRear];
    }
    public void printInfo(Queue objecQueue){
        for(int i=0;i<objecQueue.getSize();i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
   