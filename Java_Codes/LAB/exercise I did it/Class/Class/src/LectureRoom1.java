import java.util.ArrayList;
import java.util.Scanner;

class LectRoom{
    int classCode,capacity,currentSeats = 0;
    String name;
    LectRoom(int classCode,String name,int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }
    public boolean reserveSeats(int numSeats){
        if(this.currentSeats>(capacity-numSeats))
        {  
            return false;
        }
        else
        {
            this.currentSeats+=numSeats;
        }
        return true;
    }
}


public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        ArrayList<LectRoom> stu = new ArrayList<>();
        // LectRoom[] stud = new LectRoom[K];
        
        for(int i=0;i<K;i++)
        {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            // int Seats = sc.nextInt();
            LectRoom L = new LectRoom(classCode,name,capacity);
            // stud[i] = L;
            stu.add(L); 

        }
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // System.out.println(stud[n1-1].classCode + " " + stud[n1-1].name + " " + stud[n1-1].capacity);
        // System.out.println(stud[n2-1].classCode + " " + stud[n2-1].name + " " + stud[n2-1].capacity);
        // System.out.println(stud[n3-1].classCode + " " + stud[n3-1].name + " " + stud[n3-1].capacity);
        // System.out.println(stud[n2]);
        // System.out.println(stud[n3]);
        // System.out.println(stu.get(n1-1).classCode + " " + stu.get(n1-1).name + " " + stu.get(n1-1).capacity);
        // System.out.println(stu.get(n2-1).classCode + " " + stu.get(n2-1).name + " " + stu.get(n2-1).capacity);
        // System.out.println(stu.get(n3-1).classCode + " " + stu.get(n3-1).name + " " + stu.get(n3-1).capacity);
        int N =sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int classCode = sc.nextInt();
            int numSeats = sc.nextInt();
            boolean check = false;
            
            for(int j=0;j<K;j++)
            {
                if(classCode == stu.get(j).classCode)
                {
                    check = stu.get(j).reserveSeats(numSeats);
                    if(check)
                    {
                        System.out.println(stu.get(j).name); 
                        break;
                    }
                }
            }
            if(!check)
            {
                System.out.println("sorry");
            }
            
        }
    }
}
