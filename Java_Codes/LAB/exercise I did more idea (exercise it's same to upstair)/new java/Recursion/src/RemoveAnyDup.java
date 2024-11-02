import java.util.Scanner;

public class RemoveAnyDup {

    String removeAnyDup(String str){
        if(str.length() == 0){
            return "";
        }
        int indexOpen = str.indexOf(str.charAt(0));
        int indexOff = str.lastIndexOf(str.charAt(0));
        if(indexOff == indexOpen){
            char c = str.charAt(0);
            str = str.substring(1);
            return c + removeAnyDup(str);
        }
        else {
            str = str.substring(0, indexOff) + str.substring(indexOff + 1);
            return removeAnyDup(str);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup ();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}
