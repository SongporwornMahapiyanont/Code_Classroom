import java.util.Scanner;

public class AgeReport {
    public static int reportAge(int N, int[] Id, int[] age, int min, int max) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (age[i] >= min && age[i] <= max) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Id = new int[N];
        int[] age = new int[N];
        for (int i = 0; i < N; i++) {
            Id[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (age[i] >= min && age[i] <= max) {
                System.out.println(Id[i]);
            }
        }

        System.out.print("There are ");
        System.out.print(reportAge(N, Id, age, min, max));
        System.out.print(" persons in age range of ");
        System.out.print(min + " to " + max);

    }
}
