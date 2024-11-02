package ConsecDupRemoval;

import java.util.Scanner;
public class ConsecDupRemoval {
    String dupRemove(String str) {
        if(str.length()<=1)
        {
            return str; 
        }
        if(str.charAt(0)==str.charAt(1))
        {
            return dupRemove(str.substring(1));
        }
        return  str.charAt(0) + dupRemove(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);

        System.out.print(result);
        scan.close();
    }
}

// static String remove(String msg) {
//         if (msg.length() == 0) {
//             return msg;
//         }

//         String c = msg.substring(0, 1); // b
//         String msg2 = msg.substring(1); // ccccdde

//         if (msg2.indexOf(c) != -1) {
//             return remove(msg2);
//         }
//         return c + remove(msg2);
// }