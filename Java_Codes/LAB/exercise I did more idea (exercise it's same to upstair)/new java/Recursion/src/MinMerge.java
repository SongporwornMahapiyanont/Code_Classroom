import java.util.Scanner;

public class MinMerge {

    String merge(String str1, String str2){
        if((str1.length() == 0 && str2.length() > 0) || (str2.length() == 0 && str1.length() > 0) || (str1.length() == 0 && str2.length() == 0)){
            String str = str1 + str2;
            return str;
        }
        char c = ' ';
        if(str1.charAt(0) <= str2.charAt(0)){
            c = str1.charAt(0);
            
        }
        else {
            c = str2.charAt(0);
        }
        str1 = str1.substring(1);
        str2 = str2.substring(1);
        return c + merge(str1, str2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        MinMerge merger = new MinMerge();
        System.out.println(merger.merge(str1, str2));
    }
}
