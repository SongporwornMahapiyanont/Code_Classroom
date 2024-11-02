import java.util.Scanner;

class LectRoom{
    int classCode;
    String name;
    int capacity;
    int currentSeats;

    LectRoom(int classCode, String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int numSeat){
        if(numSeat + currentSeats <= capacity){
            currentSeats += numSeat;
            return true;
        }
        else{
            return false;
        }
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        LectRoom[] room = new LectRoom[n];
        for(int i=0; i<n; i++){
            int classCode = scan.nextInt();
            String name = scan.next();
            int capacity = scan.nextInt();

            room[i] = new LectRoom(classCode, name, capacity);
        }

        // for(int i=0; i<3; i++){
        //     int order = scan.nextInt() - 1;
        //     System.out.println(room[order].classCode + " " + room[order].name + " " + room[order].capacity);
        // }

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int classcode = scan.nextInt();
            int people = scan.nextInt();

            boolean completed = false;
            for(int j=0; j<n; j++){
                if(room[j].classCode == classcode){
                    completed = room[j].reserveSeats(people);
                    if(completed){
                        System.out.println(room[j].name);
                        break;
                    }
                    
                    
                }
                else {
                        System.out.println("sorry");
                    }
            }
            // if(!completed){
            //     System.out.println("sorry");
            // }
        }
    }
}
