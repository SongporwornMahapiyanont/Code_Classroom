import java.util.Scanner;

public class AlternateChar {

    String alterMerge(String s1, String s2, int order) {
        if(s1.length() == 1){
            if(order == 1){
                return Character.toString(s1.charAt(s1.length() -1));
            }
            else {
                return Character.toString(s2.charAt(s2.length() -1));
            }
        }
        
        if(order == 1){
            char c1 = s1.charAt(0);
            s1 = s1.substring(1, s1.length());
            s2 = s2.substring(1, s2.length());
            order = 2;
            return Character.toString(c1) + alterMerge(s1, s2, order);
        }
        else {
            char c2 = s2.charAt(0);
            s1 = s1.substring(1, s1.length());
            s2 = s2.substring(1, s2.length());
            order = 1;
            return Character.toString(c2) + alterMerge(s1, s2, order);
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int order = scan.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}
