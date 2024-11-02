import java.util.Scanner;

public class Up_sequence2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        for(int i=1; i<str.length(); i++){  
            if((int) str.charAt(i) > (int) str.charAt(i-1)){
                System.out.print(str.charAt(i-1));
                //System.out.println(str.charAt(i-1) + " " + str.charAt(i));
            }
            else{
                System.out.println(str.charAt(i-1));
            }
        }
        System.out.println(str.charAt(str.length()-1));
        scan.close();
    }
}
