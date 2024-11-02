import java.util.Scanner;

public class KeepTwo {

    String keepTwo(String str) {
        if(str.length() == 0){
            return "";
        }
        // System.out.println("str charAt is " + str.charAt(0));
        String s = Character.toString(str.charAt(0));
        int indexOpen = str.indexOf(s);
        int indexOff = str.lastIndexOf(s);
        int indexMiddle = str.indexOf(s, indexOpen+1);
        
        // System.out.println(indexOpen);
        // System.out.println(indexOff);
        // System.out.println(indexMiddle);
        if(indexOff >= indexOpen && indexMiddle != indexOff && indexMiddle != -1){
            str = str.substring(0, indexOff) + str.substring(indexOff + 1);
            // System.out.println(str);
            return keepTwo(str);
        }
        else {
            char c = str.charAt(0);
            // System.out.println(c);
            str = str.substring(1);
            return c + keepTwo(str);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
