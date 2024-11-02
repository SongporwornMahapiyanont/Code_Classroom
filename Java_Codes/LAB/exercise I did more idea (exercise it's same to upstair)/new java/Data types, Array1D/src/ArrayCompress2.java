import java.util.Scanner;

public class ArrayCompress2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //INPUT N.
        int round = scan.nextInt();
        round++;

        //INPUT NUM IN ARRAY.
        int[] num = new int[round];
        for(int i=0; i<round-1; i++){
            num[i] = scan.nextInt();
        }
        num[round-1] = 21; 

        //INPUT RED-NUMBER.
        int[] test = new int[3];
        for(int i=0; i<3; i++){
            test[i] = scan.nextInt();
        }

        //VARIABLE TO CHECK.
        //INT
        int result = 0;
        int check = 0;
        int check_sum = 0;
        int check_start = 0;
        int check_end = 0;
        int count = 0;
        //BOOLEAN
        boolean red = false;
        boolean start = true;
        boolean end = true;


        for(int i=0; i<round; i++){   

            //PRINT RESULT IF DONT HAVE RED-NUMBER ON THE LAST POSITION OF ARRAY.
            if(num[i]==21 && end == true){
                System.out.print(result);
            }  

            //LOOP FOR CHECK NUMBER.
            for(int j=0; j<3; j++){
                //CHECK RED-NUMBER ON THE FIRST POSITION OF ARRAY.
                if(num[0]==test[j]){
                    check_start = 1;
                }
                //CHECK RED-NUMBER ON THE LAST POSITION OF ARRAY.
                if(num[round-2]==test[j]){
                    check_end = 1;
                }
                
                //CHECK NUMBER IS RED-NUMBER.
                if(num[i]==test[j]){
                    check = 1;
                    count++;
                    break;
                }
            }

            //IF HAVE A RED-NUMBER ON THE FIRST POSITION OF ARRAY, START IS FALSE.
            //IF START TRUE, PRITN RESULT BEFORE FIRST RED-NUMBER.
            if(check_start == 1){
                start = false;
            }
            //IF HAVE A RED-NUMBER ON THE LAST POSITION OF ARRAY, END IS FALSE.
            //IF START TRUE, PRITN RESULT BEFORE LAST RED-NUMBER.
            if(check_end == 1){
                end = false;
            }

            //FIND RESULT 
            if((start == true && count < 1) || check == 0){
                result += num[i];
                red = false;
            }

            //PRINT SUM OF NUMBER BEFORE THE FIRST RED-NUMBER.
            if(start == true && count > 0){
                System.out.print(result + " ");
                start = false;
                //RESET RESULT IS 0.
                result = 0;
            }
            
            if(check == 1 && red == false){
                //CHECK IS AFTER THE FIRST RED-NUMBER.
                if(check_sum!=0){
                    //PRINT RESULT.
                    System.out.print(result + " ");
                    //RESET RESULT IS 0.
                    result = 0;
                }
                check_sum++;
                //PRINT RED-NUMBER.
                System.out.print(num[i] + " ");
                red = true;
            }
            check = 0;
        }
        scan.close();
    }
}
