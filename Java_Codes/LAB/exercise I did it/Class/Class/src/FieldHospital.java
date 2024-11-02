import java.util.Arrays;
import java.util.Scanner;
class FieldManager {
    int N,num;
    boolean[] bed;
    FieldManager(int N){
        this.N = N;
        this.bed = new boolean[N];
        for(int i=0;i<N;i++)
        {
            this.bed[i] = true;
        }
        // System.out.println(Arrays.toString(bed));
    }
    public int reserveBed(){ //K=1
        this.num = -1;
        for(int i=0;i<N;i++)
        {
            if(bed[i])
            {
                bed[i] = false;
                this.num = i+1;
                break;
            }
        }
        return num;
    }

    public boolean discharge(int A){ //K=2
        if(bed[A-1])
        {
            System.out.println("Invalid bed number");
            // System.out.println(Arrays.toString(bed));
            return false;
        }
        System.out.println("Patient discharged ");
        bed[A-1] = true;

        return true;
    }

    public void reportBed(){ //K=3
        int valbed = 0;
        for(int i=0;i<N;i++)
        {
            if(bed[i] == false)
            {
                valbed+=1;
            }
        }
        System.out.println(valbed);
    }
}

public class FieldHospital {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FieldManager fm = new FieldManager(N);

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if(K == 1 && A==0)
            {
                int B = fm.reserveBed();
                if(B != -1)
                {
                    System.out.println("Bed " + B + " reserved");
                } 
                else
                {
                    System.out.println("No bed vacancy");
                }
            }
            else if(K == 2 && A!=0)
            {
                fm.discharge(A);
            }
            else if(K==3 && A==0)
            {
                fm.reportBed();
            }
        }
        scan.close();
    }
}