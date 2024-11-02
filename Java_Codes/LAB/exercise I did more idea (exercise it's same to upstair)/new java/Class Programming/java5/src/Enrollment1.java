import java.util.ArrayList;
import java.util.Scanner;

class Course{
    String name;
    int capacity;
    ArrayList<Integer> std;

    Course(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        std = new ArrayList<>();
    }

    boolean enroll(int ID, Student12[] stds){
        boolean check = false;
        boolean check_ID = false;
        int target = 0;
        for(int i=0; i<this.std.size(); i++){
            if(ID == this.std.get(i)){
                check = true;
                break;
            }
        }

        for(int i=0; i<stds.length; i++){
            if(stds[i].ID == ID){
                check_ID = true;
                target = i;
                break;
            }
        }

        if(!check && this.std.size() < capacity && check_ID){
            this.std.add(ID);
            System.out.print(stds[target].fname + " " + stds[target].lname + " ");
            return true;
        }
        else{
            if(!check_ID){
                System.out.print("Invalid ID ");
            }
            return false;
        } 
    }

    void printInfo(){
        System.out.println(name + " " + std.size());
        for(int i=0; i<std.size(); i++){
            System.out.println(std.get(i));
        }
    }
}

class Student12{
    int ID;
    String fname;
    String lname;

    Student12(int ID, String fname, String lname){
        this.ID = ID;
        this.fname = fname;
        this.lname = lname;
    }

    void printInfo(){
        System.out.println(ID + " " + fname + " " + lname + " ");
    }
}

public class Enrollment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String name = scan.nextLine();
        // int capacity = scan.nextInt();

        // Course course = new Course(name, capacity);
        // int k = scan.nextInt();
        // for(int i=0; i<k; i++){
        //     int num = scan.nextInt();
            
        //     boolean can = course.enroll(num);
        //     System.out.println(can);
        // }

        // course.printInfo();

        int n = scan.nextInt();
        Student12[] std = new Student12[n];
        for(int i=0; i<n; i++){
            int ID = scan.nextInt();
            String fname = scan.next();
            String lname = scan.nextLine();

            std[i] = new Student12(ID, fname, lname.substring(1, lname.length()));
        }

        String name = scan.nextLine();
        int capacity = scan.nextInt();
        Course course = new Course(name, capacity);

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int num = scan.nextInt();

            boolean can = course.enroll(num, std);
            System.out.println(can);
        }

        course.printInfo();
    }
}
