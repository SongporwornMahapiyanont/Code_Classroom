package Stack;

import java.util.Scanner;

import LinkList.Node;

import java.util.Random;

public class OddEvenStack {
    private Node head;

    OddEvenStack() {
        this.head = null;
    }

    public void initiallizeStack() {
        this.head = null;
    }

    public boolean isEmptyStack() {
        return (head == null);
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.getLink();
            count++;
        }
        return count;
    }

    public void push(int info) {
        Node newnode = new Node(info);
        newnode.setLink(head);
        head = newnode;
    }

    public Node pop() throws Exception {
        if (isEmptyStack()) {
            throw new Exception("Stack underflow");
        }
        Node delNode = head;
        head = head.getLink();
        return delNode;
    }

    public int peek() throws Exception {
        if (isEmptyStack()) {
            throw new Exception("Stack underflow");
        }
        return head.getInfo();
    }

    public static OddEvenStack ConvertEven(OddEvenStack even) throws Exception {
        OddEvenStack CopyEven = new OddEvenStack();
        System.out.println("--- Even Stack [" + even.getSize() + "] ---");
        OddEvenStack tempStack = new OddEvenStack();

        while (!even.isEmptyStack()) {
            int info0 = even.pop().getInfo();
            System.out.print(info0 + " ");
            CopyEven.push(info0);
            tempStack.push(info0);
        }

        while (!tempStack.isEmptyStack()) {
            even.push(tempStack.pop().getInfo());
        }

        System.out.println();
        return CopyEven;
    }

    public static OddEvenStack ConvertOdd(OddEvenStack odd) throws Exception {
        OddEvenStack CopyOdd = new OddEvenStack();
        System.out.println("--- Odd Stack [" + odd.getSize() + "] ---");
        OddEvenStack tempStack = new OddEvenStack();

        while (!odd.isEmptyStack()) {
            int info1 = odd.pop().getInfo();
            System.out.print(info1 + " ");
            CopyOdd.push(info1);
            tempStack.push(info1);
        }

        while (!tempStack.isEmptyStack()) {
            odd.push(tempStack.pop().getInfo());
        }

        System.out.println();
        return CopyOdd;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(20);
        OddEvenStack Allnumber = new OddEvenStack();
        OddEvenStack even = new OddEvenStack();
        OddEvenStack odd = new OddEvenStack();

        System.out.println("--- Random Numbers [" + n + "] ---");
        for (int i = 0; i < n; i++) {
            int a = random.nextInt(100);
            System.out.print(a + " ");
            if (a % 2 == 0) {
                Allnumber.push(a);
                even.push(a);
            } else {
                Allnumber.push(a);
                odd.push(a);
            }
        }
        System.out.println();

        try {
            OddEvenStack CopyEven = ConvertEven(even);
            OddEvenStack CopyOdd = ConvertOdd(odd);

            while (!CopyEven.isEmptyStack() && !CopyOdd.isEmptyStack()) {
                if (CopyEven.peek() > CopyOdd.peek()) {
                    CopyEven.pop();
                } else if (CopyEven.peek() < CopyOdd.peek()) {
                    CopyOdd.pop();
                } else {
                    CopyEven.pop();
                    CopyOdd.pop();
                }
            }

            if (CopyOdd.getSize() == 0) {
                System.out.println("Even is the winner!");
            } else if (CopyEven.getSize() == 0) {
                System.out.println("Odd is the winner!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
