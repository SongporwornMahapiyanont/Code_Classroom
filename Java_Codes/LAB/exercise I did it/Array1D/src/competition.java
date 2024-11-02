import java.util.Scanner;

public class competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        int []array2 = new int[N];
        int score1 = 0;
        int score2 =0;
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            array2[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(array[i] > array2[i])
            {
                score1+=2;
            }
            else if(array2[i] > array[i])
            {
                score2+=2;
            }
            else if(array[i] == array2[i])
            {
                score1+=1;
                score2+=1;
            }
        }
        if(score1 > score2)
        {
            System.out.println("Team 1 wins");
            System.out.println("Score " + score1 + " to " + score2);
        }
        else if(score1 < score2)
        {
            System.out.println("Team 2 wins");
            System.out.println("Score " + score2 + " to " + score1);
        }
        else
        {
            System.out.println("Draw game");
            System.out.println("Score " + score1 + " to " + score2);
        }
    }
}
