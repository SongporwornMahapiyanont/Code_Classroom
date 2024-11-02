import java.util.Arrays;
import java.util.Scanner;

public class StringCUT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.next();
        int index = str.indexOf(target);
        boolean check=false;
        if(index>=0){
        while(true)
        {
            int index2 = str.indexOf(target);
            if(index2>=0){
                if(!str.substring(0, index2).equals("")){
                    System.out.println(str.substring(0, index2));
                    str = str.substring(index2+1);
                    check=true;
                }
                
            }
            else{
                System.out.print(str);
                break;
            }
            
        }if(!check){
                System.out.println("no output");
            }
    }else {
        System.out.println("no target character found");
    }
        // int []check = new int[count];
        // int index1 = str.indexOf(target);
        // for(int i=0;i<count;i++)
        // {
        //     check[i] = index1;
        //     index1 = str.indexOf(target,index1+1);
        //     System.out.println(str.substring(index, index1));
        // }
        
    }
}
