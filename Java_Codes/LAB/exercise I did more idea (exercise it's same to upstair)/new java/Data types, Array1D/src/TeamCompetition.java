import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }

        int s1= 0;
        int s2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > arr2[i]){
                s1+=2;
            }
            else if(arr[i] == arr2[i]){
                s1++;
                s2++;
            }
            else{
                s2+=2;
            }
        }

        if(s1 > s2){
            System.out.println("Team 1 wins");
            System.out.println("Score " + s1 + " to " + s2);
        }
        else if(s1 < s2){
            System.out.println("Team 2 wins");
            System.out.println("Score " + s2 + " to " + s1);
        }
        else{
            System.out.println("Draw game");
            System.out.println("Score " + s1 + " to " + s2);
        }
        scan.close();
    }
}
