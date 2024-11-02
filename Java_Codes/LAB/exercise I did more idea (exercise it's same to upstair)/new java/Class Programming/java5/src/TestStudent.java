import java.sql.Struct;
import java.util.Scanner;

class Student{
    public String firstName;
    public String lastName;
    private int[] stepScore;

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        stepScore = new int[4];
    }

    int getTestScore(int type){
        return stepScore[type];
    }

    void setTestScore(int type, int score){
        stepScore[type] = score;
    }

    int computeTotal(){
        int total = 0;
        for(int i=0; i<4; i++){
            total += stepScore[i];
        }

        return total;
    }

    void printInfo(){
        System.out.println(firstName + " " + lastName + " " + computeTotal());
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Student[] std = new Student[n];

        for(int i=0; i<n; i++){
            String firstName = scan.next();
            String lastName = scan.next();
            
            std[i] = new Student(firstName, lastName);
            for(int j=0; j<4; j++){
                int score = scan.nextInt();
                std[i].setTestScore(j, score);
            }

            std[i].printInfo();
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int people = scan.nextInt() - 1;
            int type = scan.nextInt() - 1;

            int score = std[people].getTestScore(type);
            System.out.println(score);
        }
    }
}


