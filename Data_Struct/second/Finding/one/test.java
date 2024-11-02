package Finding.one;
import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(10,20);
        Hash[] HashTable = new Hash[(2*n)]; 
        
        
        for(int i=0;i<n;i++)
        {
            int value = random.nextInt(100);
            int k = random.nextInt((2*n));
            boolean c = false;
            while (HashTable[k] != null) {
                k = (k + 1) % (2 * n); // หากตำแหน่งถูกใช้แล้วให้ไปที่ตำแหน่งถัดไป
                c = true;
            }
            HashTable[k] = new Hash(value);
            if(c==true)
            {
                HashTable[k].move = true;
            }
        }
        for(int i=0;i<2*n;i++)
        {
            if(HashTable[i]!=null)
            {
                int sum = HashTable[i].value;
                for(int j=i+1;j<2*n;j++)
                {
                    if(HashTable[j]!=null && sum==HashTable[j].value)
                    {
                        HashTable[j].setrepeat();
                    }
                }
            }
        }
        System.out.println("--- Random Numbers [" + n + "] ---");
        for(int i=0;i<2*n;i++)
        {
            if(HashTable[i]!=null)
            {
                if(HashTable[i].isrepeat())
                {
                    System.out.print("!"+HashTable[i].value+" ");
                }
                else
                {
                    System.out.print(HashTable[i].value+" ");
                }
            }
        }

        System.out.println();
        System.out.println("--- Hash Table [" + n + "] ---");
        for(int i=0;i<(2*n);i++)
        {
            if(HashTable[i]!=null)
            {
                if(HashTable[i].move == true)
                {
                    System.out.print(i +":"+HashTable[i].value + "* ");
                }
                else
                {
                    System.out.print(i +":"+HashTable[i].value + " ");
                }
            }
            
        }

        
        int num=0;
        int Totalfinding = 0;
        System.out.println();
        System.out.println("--- Finding Match ---");
        while(num<3)
        {
            int m = random.nextInt(100);
            for(int i=0;i<(2*n);i++)
            {
                if(HashTable[i]!=null && HashTable[i].value+m == 100 && !HashTable[i].deleted())
                {
                    HashTable[i].markDeleted();
                    num+=1;
                }
            }
            Totalfinding+=1;
        }
        for(int i=0;i<(2*n);i++)
        {
            if(HashTable[i]!=null)
            {
                if(HashTable[i].deleted())
                {
                    System.out.print(HashTable[i].value + " ");
                }
                else
                {
                    System.out.print("!" + HashTable[i].value + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Total Finding: " + Totalfinding);

        int N =0;
        for(int i=0;i<(2*n);i++)
        {
            if(HashTable[i]!=null)
            {
                if(!HashTable[i].deleted())
                {
                    // System.out.print(HashTable[i].value + " ");
                    N+=1;
                }
            }
        }
        System.out.println("--- Hash Table [" + N + "] ---");
        for(int i=0;i<(2*n);i++)
        {
            if(HashTable[i]!=null)
            {
                if(!HashTable[i].deleted())
                {
                    System.out.print(HashTable[i].value + " ");
                }
            }
        }
    }
}
