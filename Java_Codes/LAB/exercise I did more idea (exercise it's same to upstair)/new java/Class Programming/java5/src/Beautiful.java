import java.util.Scanner;

class Audience{
    String[] msg;
    int count = 0;
    boolean dis = true;
    
    Audience(String[] msg){
        this.msg = msg;
    }
    
    boolean isBeautiful(){
        if(count == msg.length){
            count = 0;
        }
        //System.out.println(msg[count]);
        if(msg[count].equals("beautiful")){
            count++;
            return true;
        }
        else {
            count++;
            return false;
        }    
    }
}

public class Beautiful {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String[] caster = new String[n];
        for(int i=0; i<n; i++){
            caster[i] = scan.nextLine();
        }

        int people = scan.nextInt();
        Audience[] au = new Audience[people];

        for(int i=0; i<people; i++){
            int num_msg = scan.nextInt();
            scan.nextLine();
            String[] msg = new String[num_msg];
            for(int j=0; j<num_msg; j++){
                msg[j] = scan.nextLine();
            }

            au[i] = new Audience(msg);
        }

        
        for(int i=0; i<n; i++){  
            //System.out.println("==============================");
            if(caster[i].equals("crack")){
                boolean check = false;
                for(int j=0; j<people; j++){
                    if(!au[j].isBeautiful() && au[j].dis){
                        au[j].dis = false;
                        System.out.print(j+1 + " ");
                        check = true;
                    }
                }
        
                if(!check){
                    System.out.print("x");
                }
                System.out.println();
            }
            else{
                for(int j=0; j<people; j++){
                    au[j].isBeautiful();
                }
            }
        }
    }
}
