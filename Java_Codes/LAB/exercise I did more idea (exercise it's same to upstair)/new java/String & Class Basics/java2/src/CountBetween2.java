import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int upper = 0;
        int lower = 0;
        int not = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper++;
            }
            else if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
            else{
                not++;
            }   
        }

        System.out.println(lower);
        System.out.println(upper);
        System.out.println(not);

        scan.close();
    }
}
