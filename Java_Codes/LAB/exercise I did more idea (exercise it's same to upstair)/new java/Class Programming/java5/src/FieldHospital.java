import java.util.Scanner;

class FieldManager{
    int bed;
    int[] arr_bed;

    FieldManager(int bed){
        this.bed = bed;
        this.arr_bed = new int[bed];
    }

    int reserveBed(){
        int bed_num = -1;
        for(int i=0; i<bed; i++){
            if(arr_bed[i] == 0){
                bed_num = i+1;
                arr_bed[i] = 1;
                break;
            }
        }
        return bed_num;
    }

    boolean discharge(int num){
        boolean check = false;
        if(arr_bed[num] == 1){
            arr_bed[num] = 0;
            System.out.println("Patient discharged");
            check = true;
        }
        else{
            System.out.println("Invalid bed number");
        }
        return check;
    }

    void reportBed(){
        int sum = 0;
        for(int i=0; i<bed; i++){
            if(arr_bed[i] == 1){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        FieldManager hos = new FieldManager(n);

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int k = scan.nextInt();
            int a = scan.nextInt() -1;

            if(k == 1){
                int bed = hos.reserveBed();
                if(bed != -1){
                    System.out.println("Bed " + bed + " reserved");
                }
                else{
                    System.out.println("No bed vacancy");
                }
            }
            else if(k == 2){
                hos.discharge(a);
            }
            else{
                hos.reportBed();
            }
        }

    }
}
