package Finding;
import java.util.*;


public class Match {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        // int n = random.nextInt(10,20);
        int n = scan.nextInt();
        Hash hashtable = new Hash(n);
        System.out.println("--- Random Numbers [" + n + "] ---");
        for(int i=0;i<n;i++)
        {
            // int value = random.nextInt(0,100);
            int value = scan.nextInt();
            boolean check = hashtable.checkkey(value,n);
            if(!check)
            {
                hashtable.LinearProbing(value, n);
                System.out.print(value+ " ");
            }
            else
            {
                i-=1;
                System.out.print("!" + value + " ");
            }
        }
        System.out.println("\n--- Hash Table [" + n + "] ---" );
        hashtable.seaching();
        System.out.println();
        int num=1;
        int totalfind=0;
       System.out.println("--- Finding Match ---");
        while(num<=3)
        {
            // int r = random.nextInt(0,100);
            int r = scan.nextInt();
            totalfind+=1;
            if(hashtable.FindingMatch(r))
            {
                System.out.print(r+ " ");
                hashtable.del(r);
                num+=1;
            }
            else{
                System.out.print("!" + r+" ");
            }
        }
        System.out.println();
        System.out.println("Total Finding: " + totalfind);
        hashtable.displayhash();

    }
}

class Hash{
    Integer[] table;
    int size;
    Hash(int n) {
        this.table = new Integer[2*n];
        this.size = 2*n;
    }
    public void displayhash(){
        int n = 0;
        for(int i=0;i<size;i++)
        {
            if(table[i]!=null && table[i]!=-99)
            {
                n+=1;
            }
        }
        System.out.println("--- Hash Table ["+ n + "] ---");
        
        seaching();
        
    }
    public int hashFunction(int value){
        return value%size;
    }
    public void LinearProbing(int value,int n){
        int a = value%(2*n); //key
        while(table[a]!=null) // linear probing
        {
            a+=1;
        }
        table[a] = value;
    }
    public void del(int r){
        int x = 100-r;
        for(int i=0;i<size;i++)
        {
            if(table[i]!=null && table[i]==x)
            {
                table[i] = -99; //mark
            }
        }
    }
    public boolean checkmate(int i){
        if(table[i]!=null)
        {
            if(hashFunction(table[i]) != i)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    public boolean checkkey(int value,int n){
        for(int i=0;i<table.length;i++)
        {
            if(table[i]!=null && table[i] == value)
            {
                return true;
            }
            // return false;
        }
        return false;
    }
    public void seaching(){
        for(int i=0;i<table.length;i++)
        {
            if(table[i]!=null && table[i]!=-99)
            {
                if(checkmate(i))
                {
                    System.out.print(i + ":" + table[i] + " ");
                }
                else{
                    System.out.print(i + ":" + table[i] + "* ");
                }
            }
        }
    }
    public boolean FindingMatch(int r){
        for(int i=0;i<size;i++)
        {
            if(table[i]!=null)
            {
                if(r+table[i]==100)
                {
                    return true;
                }
            }
        }
        return false;
    }
}