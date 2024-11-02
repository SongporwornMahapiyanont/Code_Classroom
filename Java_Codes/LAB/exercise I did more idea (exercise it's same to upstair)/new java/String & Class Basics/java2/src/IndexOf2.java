import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        int l = str.length();
        boolean not_found = true;
        
        int count = 0;
        for(int i=0; i<=l; i++){
            int found = str.indexOf(str2, count);
            if(found == -1){
                break;
            }
            
            count=found+1;
            System.out.print(count + " ");
            not_found = false;
        }

        if(not_found){
            System.out.println("string not found");
        }
        scan.close();
    }
}
