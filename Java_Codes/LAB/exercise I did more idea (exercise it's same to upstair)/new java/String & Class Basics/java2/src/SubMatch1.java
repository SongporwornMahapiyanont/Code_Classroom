import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        for(int i=0; i<3; i++){
            String str3 = str2.substring(i,i+3);
            int found = str.indexOf(str3);
            if(found == -1){
                System.out.println("No");
            }
            else {
                System.out.println(found+1);
            }
        }
        scan.close();
    }
}

