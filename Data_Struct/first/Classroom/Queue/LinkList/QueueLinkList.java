package Queue.LinkList;

import java.util.*;

import LinkList.Node;
import Queue.LinkList.NodeQueue;
public class QueueLinkList {
    private NodeQueue QueueFront = null;
    private NodeQueue QueueRear = null;
    private int count = 0;
    public void initiallizeQueue(){
        QueueFront = null;
        QueueRear = null;
        count=0;
    }
    public boolean isEmptyQueue(){
        return (QueueFront==null);
    }
    public boolean isFullQueue(){
        return false;
    }
    public Object front() throws Exception{
        if (isEmptyQueue()) {
            throw new Exception("QueueUnderflow");
        }
        return QueueFront.getInfo();
    }
    public Object back() throws Exception{
        if (isFullQueue()) {
            throw new Exception("Queueoverflow");
        }
        return QueueRear.getInfo();
    }
    public void enQueue(Object newItem){
        NodeQueue newNode = new NodeQueue(newItem);
        if(QueueFront == null)
        {
            QueueFront = newNode;
            QueueRear = newNode;
        }
        else{
            QueueRear.setLink(newNode);
            QueueRear = QueueRear.getLink();
        }
        count++;
    }
    public Object deQueue(Object newItem) throws Exception{
        Object ItemInfo;
        if(isEmptyQueue())
        {
            throw new Exception("QueueOverflow");
        }
        ItemInfo = QueueFront.getInfo();
        QueueFront = QueueFront.getLink();
        if(QueueFront==null)
        {
            QueueRear = null;
        }
        count--;
        return ItemInfo;
    }
    public int getSize(){
        return count;
    }
    public void printInfo(QueueLinkList Item){
        NodeQueue trav1 = QueueFront;
        NodeQueue trav2 = QueueFront;
        while(trav1.getLink()!=null)
        {
            trav2 = trav1;
            System.out.print(trav2.getInfo() + " ");
            trav1 = trav1.getLink();
        }
        System.out.print(trav1.getInfo() + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        QueueLinkList even = new QueueLinkList();
        QueueLinkList odd = new QueueLinkList();
        // int n = random.nextInt(10, 20);
        int n = 10 + random.nextInt(20);
        even.initiallizeQueue();
        odd.initiallizeQueue();
        System.out.println("--- Random numbers [" + n + "] ---");
        for(int i=0;i<n;i++)
        {
            int number = random.nextInt(100);
            if(number%2==0)
            {
                even.enQueue(number);
            }
            else{
                odd.enQueue(number);
            }
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("--- Even Queue [" + even.getSize() + "] ---");
        even.printInfo(even);
        System.out.println("--- Odd Queue [" + odd.getSize() + "] ---");
        odd.printInfo(odd);

    }
}
