import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        int l = str.length();
        if(str.length() > str2.length()){
            l = str2.length();
        }

        
        for(int i=0; i<l; i++){
            if(str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '{' || str.charAt(i) == '}'){
                System.out.print(str.charAt(i));
            }
            else if(str2.charAt(i) == '(' || str2.charAt(i) == ')' || str2.charAt(i) == '{' || str2.charAt(i) == '}'){
                System.out.print(str2.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else if(Character.isDigit(str2.charAt(i))){
                System.out.print(str2.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else if(Character.isUpperCase(str2.charAt(i))){
                System.out.print(str2.charAt(i));
            }
            else {
                System.out.print(str.charAt(i));
            }
        }
        scan.close();
    }
}
