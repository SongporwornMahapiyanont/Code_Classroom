import java.util.Scanner;

class Carriage{
    int capacity;
    int type;
    int code;
    int seat = 0;
    int stand = 0;

    Carriage(int capacity, int type, int code){
        this.capacity = capacity;
        this.type = type;
        this.code = code;
    }

    void reserveSeats(int seat_want){
        if(type == 3){
            if(seat_want + seat <= capacity){
                seat+=seat_want;
            }
            else if(seat_want + seat > capacity){
                seat_want = seat_want - (capacity - seat);
                if(stand + seat_want <= 10){
                    seat = capacity;
                    stand += seat_want; 
                }
                
            }
        }
        else {
            if(seat_want + seat <= capacity){
                seat+=seat_want;
            }
        }
    }

    void printStats(){
        System.out.print(code + " " + type + " " + seat + " " + capacity);
        if(type == 3){
            System.out.print(" " + stand + " 10");
        }
        System.out.println();
    }
}

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Carriage[] train = new Carriage[n];
        for(int i=0; i<n; i++){
            int type = scan.nextInt();
            int capacity = scan.nextInt();
            int code = scan.nextInt();

            train[i] = new Carriage(capacity, type, code);
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int p = scan.nextInt() - 1;
            int q = scan.nextInt();

            train[p].reserveSeats(q);
        }

        for(int i=0; i<n; i++){
            train[i].printStats();
        }
    }
}
