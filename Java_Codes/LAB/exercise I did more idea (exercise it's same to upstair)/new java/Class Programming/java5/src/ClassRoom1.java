import java.util.Scanner;

class Classroom{
    String name_room;
    int seat;
    boolean pro;
    boolean vi;
    boolean smart;
    boolean camera;
    boolean use = true;

    Classroom(String name_room, int seat, boolean pro, boolean vi, boolean smart, boolean camera){
        this.name_room = name_room;
        this.seat = seat;
        this.pro = pro;
        this.vi = vi;
        this.smart = smart;
        this.camera = camera;
    }

    boolean isAvailable(int seat, boolean pro, boolean vi, boolean smart, boolean camera){
        if(this.seat >= seat && (!pro || (pro && this.pro)) && (!vi || (vi && this.vi)) && (!smart || (smart && this.smart)) && (!camera || (camera && this.camera))){
            if(pro) this.pro = false;
            if(vi) this.vi = false;
            if(smart) this.smart = false;
            if(camera) this.camera = false;
            return true;
        }
        else {
            return false;
        }
    }

    boolean reserve(int seat, boolean pro, boolean vi, boolean smart, boolean camera){
        if(isAvailable(seat, pro, vi, smart, camera) && use){
            use = false;
            return true;
        }
        else {
            return false;
        }
    }
}

public class ClassRoom1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Classroom[] clr = new Classroom[n];
        scan.nextLine();
        for(int i=0; i<n; i++){
            String name = scan.next();
            int seat = scan.nextInt();
            int pro = scan.nextInt();
            int vi = scan.nextInt();
            int smart = scan.nextInt();
            int camera = scan.nextInt();

            boolean pro_ = false;
            boolean vi_ = false;
            boolean smart_ = false;
            boolean camera_ = false;
            if(pro == 1){
                pro_ = true;
            }
            if(vi == 1){
                vi_ = true;
            }
            if(smart == 1){
                smart_ = true;
            }
            if(camera == 1){
                camera_ = true;
            }

            clr[i] = new Classroom(name, seat, pro_, vi_, smart_, camera_);
        }

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int seat = scan.nextInt();
            int pro = scan.nextInt();
            int vi = scan.nextInt();
            int smart = scan.nextInt();
            int camera = scan.nextInt();

            boolean pro_ = false;
            boolean vi_ = false;
            boolean smart_ = false;
            boolean camera_ = false;
            if(pro == 1){
                pro_ = true;
            }
            if(vi == 1){
                vi_ = true;
            }
            if(smart == 1){
                smart_ = true;
            }
            if(camera == 1){
                camera_ = true;
            }

            boolean found = false;
            for(int j=0; j<n; j++){
                if(clr[j].reserve(seat, pro_, vi_, smart_, camera_)){
                    //System.out.println(clr[j].name_room + " " + clr[j].seat + " " + clr[j].pro + " " + clr[j].vi + " " + clr[j].smart + " " + clr[j].camera);
                    System.out.println(clr[j].name_room);
                    found = true;
                    clr[j].seat -= seat;
                    break;
                }
            }

            if(!found) {
                System.out.println("classroom not available");
            }
        }
    }
}
