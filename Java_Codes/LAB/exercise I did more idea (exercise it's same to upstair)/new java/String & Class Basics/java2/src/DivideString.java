import java.util.ArrayList;
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        ArrayList<Character> upper = new ArrayList<Character>();
        ArrayList<Character> lower = new ArrayList<Character>();
        ArrayList<Character> not = new ArrayList<Character>();

        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper.add(str.charAt(i));
            }
            else if(Character.isLowerCase(str.charAt(i))){
                lower.add(str.charAt(i));
            }
            else{
                not.add(str.charAt(i));
            }
        }

        for(int i=0; i<lower.size(); i++){
            System.out.print(lower.get(i));
        }
        System.out.println();
        for(int i=0; i<upper.size(); i++){
            System.out.print(upper.get(i));
        }
        System.out.println();
        for(int i=0; i<not.size(); i++){
            System.out.print(not.get(i));
        }
        scan.close();
    }
}
