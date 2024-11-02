import java.util.Scanner;

public class Winner{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int [][]array = new int[R][C];
        int ship=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                array[i][j] = sc.nextInt();
                if(array[i][j]==1)
                {
                    ship+=1;
                }
            }
        } 

        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;

        int atk = 0;
        int bat = 0;
        int totalship = ship;

        int fistRound = -2;
        int lastRound = -2;

        int K = sc.nextInt();

        for(int i=0;i<K;i++)
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            
            if(row>0 && row<=R && col>0 && col<=C)
            {
                if(array[row-1][col-1]==0)
                {
                    freq2+=1;
                    array[row-1][col-1]=3;
                    
                }
                else if(array[row-1][col-1]==1)
                {
                    freq1+=1;
                    array[row-1][col-1]=2;
                    if (ship == totalship) 
                    {
                        fistRound = i;
                    }
                    ship-=1;
                    if (ship == 0) 
                    {
                        lastRound = i;
                    }
                    
                }
                else if(array[row-1][col-1]==2)
                {
                    freq3+=1;
                }
                else if(array[row-1][col-1]==3)
                {
                    freq4+=1;
                }

            }
            else
            {
                freq5+=1;
            }
           
        }
        System.out.println(freq1);
        System.out.println(freq2);
        System.out.println(freq3);
        System.out.println(freq4);
        System.out.println(freq5);
        if(ship>0)
        {
            System.out.println("battleship" + " " +(fistRound+1));
        }
        else if(ship==0)
        {
            System.out.println("attacker" + " " + (lastRound+1));
        }
    }
}
