import java.util.Scanner;

public class AgeReport {
    static int reportAge(int num, int[] id, int[] age, int max_age, int min_age){
        int count = 0;
        for(int i=0; i<num; i++){
            if(age[i] >= min_age && age[i] <= max_age){
                System.out.println(id[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] Id = new int[n];
        int[] Age = new int[n];

        for(int i=0; i<n; i++){
            Id[i] = scan.nextInt();
            Age[i] = scan.nextInt();
        }

        int min = scan.nextInt();
        int max = scan.nextInt();

        int p = reportAge(n, Id, Age, max, min);
        System.out.println("There are " + p + " persons in age range of " + min + " to " + max);

    }
}
