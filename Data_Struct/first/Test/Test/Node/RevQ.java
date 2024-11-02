package Test.Node;
/*
NO: xx
ID: xxxxxxxxx
GROUP: x
CODE: xxxx
SEAT: xx
IP: N.N.N.N
*/

import java.util.Scanner;

public class RevQ {

    public static void inputQ(Queue q) {
        Scanner keyboard = new Scanner(System.in);
        int data;
        try{
            do {
                data = keyboard.nextInt();
                if(data>=0)
                    q.enQueue(data);
            } while(data>=0);
        } catch(Exception e) {}
    } 

    public static void showQ(Queue q){
        try {
            while (!q.isEmptyQueue()) {
                System.out.print(q.deQueue() + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void reverseOddQ(Queue q) {
        try {
            Stack oddStack = new Stack();
            for(int i=0;i<q.getsize();i++){
                int number = q.deQueue();
                if(number%2!=0)
                {
                    // System.out.println(number);
                    oddStack.push(number);   
                }
                q.enQueue(number);
            }
            System.out.println("size = " + q.getsize());
            for(int i=0;i<q.getsize();i++)
            {
                int number = q.deQueue();
                if(number%2!=0)
                {
                    q.enQueue(oddStack.pop());
                }
                else{
                    q.enQueue(number);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        Queue q=new Queue();
        inputQ(q);
        reverseOddQ(q);
        showQ(q);
    }
}
