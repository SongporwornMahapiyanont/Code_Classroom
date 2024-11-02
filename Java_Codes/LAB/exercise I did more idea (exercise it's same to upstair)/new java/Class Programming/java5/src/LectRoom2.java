import java.util.Scanner;

class LectRoom1{
    int classCode;
    String name;
    int capacity;
    int currentSeats;

    LectRoom1(int classCode, String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int classCode, int numSeat){
        if(this.classCode == classCode && numSeat + currentSeats <= capacity){
            currentSeats += numSeat;
            return true;
        }
        else{
            return false;
        }
    }
}

public class LectRoom2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        LectRoom1[] room = new LectRoom1[n];
        for(int i=0; i<n; i++){
            int classCode = scan.nextInt();
            String name = scan.next();
            int capacity = scan.nextInt();

            room[i] = new LectRoom1(classCode, name, capacity);
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int classCode = scan.nextInt();
            int numSeat = scan.nextInt();

            boolean check_room = false;
            for(int j=0; j<n; j++){
                check_room = room[j].reserveSeats(classCode, numSeat);
                if(check_room){
                    System.out.println(room[j].name);
                    break;
                }
            }

            if(!check_room){
                System.out.println("sorry");
            }
        }
    }
}
