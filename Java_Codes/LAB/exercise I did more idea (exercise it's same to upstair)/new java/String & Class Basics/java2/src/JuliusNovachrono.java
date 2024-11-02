import java.util.Scanner;

public class JuliusNovachrono {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int num = scan.nextInt();
        if(num == 0){
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i));
            }
        }
        else if(num > 0){
            for(int i=0; i<num; i++){
                System.out.print(str.charAt(i));
            }
        }
        else{
            for(int i=str.length()-1; i>=0; i--){
                System.out.print(str.charAt(i));
            }
        }
        scan.close();
    }
}
