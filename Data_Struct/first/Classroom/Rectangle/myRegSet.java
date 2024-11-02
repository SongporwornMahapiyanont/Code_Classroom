package Rectangle;
import java.util.Scanner;

public class myRegSet
{
    static int defaultMaxItem=5;
	int maxItem=0;
	int noItem=0;
	Rectangle RegArr[];
	String title="";
	
	public myRegSet() {
		this(defaultMaxItem);
	}
	public myRegSet(String title) {
		this.title=title;
	}
	public myRegSet(String title,int max) {
		maxItem=max;
		RegArr=new Rectangle[max];
		this.title=title;
	}
	public myRegSet(int max) {
		maxItem=max;
		RegArr=new Rectangle[max];
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void add(Rectangle reg) {
		RegArr[noItem]=reg;
		noItem++;
	}
    public String toString() {
        String tstr="";
        for (int i=0;i<noItem;i++){
            tstr=tstr+RegArr[i]+"\n";
        }
        return tstr;
    }    
public static void main(String[] args) {
    myRegSet regset1=new myRegSet(2);
    Rectangle newreg1= new Rectangle(1,2);
    Rectangle newreg2= new Rectangle(2,3);
    regset1.add(newreg1);
    regset1.add(newreg2);
    System.out.println(regset1);
}
}