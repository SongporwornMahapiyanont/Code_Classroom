package LinkList;
import java.util.List;

public class ListNum {

    /**
     * @param args the command line arguments
     */
    private static Node head=null;
    private Node newNode;
    public ListNum()
    {

    } 
    public void addNodeFirst(int newInfo) {
    	newNode = new Node(newInfo);
		newNode.setLink(head);	
		head = newNode;
    }

    public void addNodeLast(int newInfo){
        newNode = new Node(newInfo,head);
        Node trav1=head,trav2=head;
        while (trav1!=null) {
            trav2=trav1;
            trav1 = trav1.getLink(); 
        }
        if (trav1!=trav2){
            trav2.setLink(newNode);
            newNode.setLink(null);
        }
        else{
            head = newNode;
        }
    }
    public void delfirst(){
        Node delNode = head;
        if(head!=null)
        {
            System.out.println("___");
            head = head.getLink();
        }
    }
    public void delLast(){
        Node trav1=head,trav2=head;
        while(trav1 !=null && trav1.getLink()!=null) 
        {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        if(trav2!=null)
        {
            trav2.setLink(null);
        }
    }

    public void deltorequest(int newInfo){
        Node delnode = head;
        Node trav1=head,trav2=head;
        while (trav1!=null) {
            if(trav1.getInfo() == newInfo)
            {
                // delnode = trav1;
                if(trav1!=head)
                {
                    trav2.setLink(trav1.getLink());
                }
                else{
                    head = trav1.getLink();
                }
            }
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        
        // trav2.setLink(null);
        // System.out.println(trav2.getLink());
        // System.out.println(trav2.getInfo());
    }

    public int indexofdata(int newInfo){
        Node trav1 = head,trav2 = head;
        int count=1;
        while (trav1!=null) {
            if(trav1.getInfo()==newInfo)
            {
                break;
            }
            count+=1;
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        return count;
    }
    public void sort(int newInfo){
        newNode = new Node(newInfo);
        Node trav1=head,trav2=head;
        while (trav1!=null && trav1.getInfo()<newNode.getInfo()) {
                trav2 = trav1; 
                // System.out.println();
                trav1 = trav1.getLink(); // null (info) | null (link)
        }
        newNode.setLink(trav1);
        if(trav1!=trav2)
        {
            trav2.setLink(newNode);
        }
        else{
            head = newNode;
        }
    }

    public int lengh(Node head){
        int count = 0;
        Node temp = head;
        while (temp!=null) {
            count+=1;
            temp = temp.getLink();
        }
        return count;
    }
    public String toString() {
        Node trav=head;
        String str="";
        while (trav!=null) {			
            str=str.concat(trav.toString());
            //str=str.concat(""+trav.getInfo());
                    trav=trav.getLink();
            if(trav!=null)
                        str=str.concat(" | ");		
        }
        return str;
    }
    

    public static void main(String[] args) {
        ListNum listNum1=new ListNum();
        listNum1.addNodeFirst(10);
        listNum1.addNodeFirst(20);
        listNum1.addNodeFirst(30);             
        // listNum1.addNodeLast(40);
        // listNum1.addNodeLast(90);
        // listNum1.addNodeLast(540);
        // listNum1.sort(10);
        // listNum1.sort(40);
        // listNum1.sort(20);
        // listNum1.sort(30);
        // listNum1.delfirst();
        // listNum1.delfirst();
        // listNum1.delLast();
        // System.out.println("index is : " + listNum1.indexofdata(40));
        // listNum1.deltorequest(20);
        // listNum1.deltorequest(90);
        // listNum1.deltorequest(540);
        
        System.out.println("lengh : " + listNum1.lengh(head));
        System.out.println(listNum1);
    }    
}